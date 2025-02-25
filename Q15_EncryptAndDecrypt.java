




package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    String email;
    double salary;

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
}

public class Q15_EncryptAndDecrypt {
    static String csvFilePath = "employees.csv";
    static SecretKey secretKey;

    public static void main(String[] args) throws Exception {
        secretKey = generateKey();
        writeEncryptedCSV();
        readDecryptedCSV();
    }

    public static void writeEncryptedCSV() throws Exception {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Kanishk", "kanishk@example.com", 60000),
                new Employee(2, "Ayush", "ayush@example.com", 75000),
                new Employee(3, "Ritik", "ritik@example.com", 82000),
                new Employee(4, "Krishna", "krishna@example.com", 90000),
                new Employee(5, "Abhishek", "abhishek@example.com", 65000)
        );

        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"});
            for (Employee emp : employees) {
                writer.writeNext(new String[]{
                        String.valueOf(emp.id),
                        emp.name,
                        encrypt(emp.email),
                        encrypt(String.valueOf(emp.salary))
                });
            }
            System.out.println("Encrypted CSV file written successfully: " + csvFilePath);
        }
    }

    public static void readDecryptedCSV() throws Exception {
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            String[] nextRecord;
            reader.readNext();
            System.out.println("Decrypted Employee Data:");
            while ((nextRecord = reader.readNext()) != null) {
                System.out.println("ID: " + nextRecord[0] +
                        ", Name: " + nextRecord[1] +
                        ", Email: " + decrypt(nextRecord[2]) +
                        ", Salary: " + decrypt(nextRecord[3]));
            }
        }
    }

    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        return keyGen.generateKey();
    }

    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
    }

    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
    }
}
