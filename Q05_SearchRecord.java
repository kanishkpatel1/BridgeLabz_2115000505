package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q05_SearchRecord {
    public static void main(String[] args) {
        String filePath = "employees2.csv";
        createCSVFile(filePath);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine();
        searchEmployee(filePath, searchName);
        scanner.close();
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                String[] header = {"ID", "Name", "Department", "Salary"};
                String[] emp1 = {"101", "Kanishk", "Engineering", "60000"};
                String[] emp2 = {"102", "Ayush", "HR", "50000"};
                String[] emp3 = {"103", "Ritik", "Marketing", "55000"};
                String[] emp4 = {"104", "Krishna", "Developer", "70000"};
                String[] emp5 = {"105", "Abhishek", "Finance", "65000"};

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
        } else {
            System.out.println("CSV file already exists: " + file.getAbsolutePath());
        }
    }

    private static void searchEmployee(String filePath, String name) {
        boolean found = false;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[1].equalsIgnoreCase(name)) {
                    System.out.println("Employee Found: ");
                    System.out.println("Department: " + nextLine[2]);
                    System.out.println("Salary: " + nextLine[3]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
