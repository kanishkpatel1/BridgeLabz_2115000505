
package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student { " +
                "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Marks: " + marks +
                " }";
    }
}

public class Q09_CsvDataToJavaObject  {
    public static void main(String[] args) {
        String filePath = "students.csv";

        createCSVFile(filePath);
        List<Student> students = readCSVToObjects(filePath);

        System.out.println("\nStudent Records:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                writer.println("ID,Name,Age,Marks");
                writer.println("101,Kanishk,20,85");
                writer.println("102,Ayush,21,78");
                writer.println("103,Ritik,19,90");
                writer.println("104,Krishna,22,88");
                writer.println("105,Abhishek,20,75");

                System.out.println("CSV file created successfully: " + file.getAbsolutePath());
            }
            catch (IOException e) {
                System.out.println("Error creating CSV file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("CSV file already exists: " + file.getAbsolutePath());
        }
    }

    private static List<Student> readCSVToObjects(String filePath) {
        List<Student> students = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            reader.readNext(); // Skip header

            while ((nextLine = reader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                int age = Integer.parseInt(nextLine[2]);
                int marks = Integer.parseInt(nextLine[3]);

                students.add(new Student(id, name, age, marks));
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
        return students;
    }
}
