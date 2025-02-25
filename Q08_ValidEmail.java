package com.lcwd.test;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Q08_ValidEmail {
    public static void main(String[] args) {
        String filePath = "employee5.csv";

        createCSVFile(filePath);
        validateCSVData(filePath);
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                String[] header = {"ID", "Name", "Email", "Phone", "Department"};
                String[] emp1 = {"101", "Kanishk", "kanishk@example.com", "9876543210", "Engineering"};
                String[] emp2 = {"102", "Ayush", "ayush@company", "123456789", "IT"};
                String[] emp3 = {"103", "Ritik", "ritik123@email.com", "9123456789", "Marketing"};
                String[] emp4 = {"104", "Krishna", "krishna@", "98765432100", "IT"};
                String[] emp5 = {"105", "Abhishek", "abhishek@domain.com", "8527419630", "Finance"};

                writer.writeNext(header);
                writer.writeNext(emp1);
                writer.writeNext(emp2);
                writer.writeNext(emp3);
                writer.writeNext(emp4);
                writer.writeNext(emp5);

                System.out.println("CSV file created successfully: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error creating CSV file.");
                e.printStackTrace();
            }
        }
        else {
            System.out.println("CSV file already exists: " + file.getAbsolutePath());
        }
    }

    private static void validateCSVData(String filePath) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            String[] nextLine;
            System.out.println("Validating CSV Data");

            while ((nextLine = reader.readNext()) != null) {
                String id = nextLine[0];
                String name = nextLine[1];
                String email = nextLine[2];
                String phone = nextLine[3];
                String department = nextLine[4];

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = phonePattern.matcher(phone).matches();

                if (!isEmailValid || !isPhoneValid) {
                    System.out.println("Invalid Record: " + Arrays.toString(nextLine));
                    if (!isEmailValid) System.out.println("Invalid Email: " + email);
                    if (!isPhoneValid) System.out.println("Invalid Phone: " + phone);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
