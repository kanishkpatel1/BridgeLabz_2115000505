package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q06_UpdateSalary {
    public static void main(String[] args) {
        String inputFilePath = "employees3.csv";
        String outputFilePath = "updated_employees.csv";

        createCSVFile(inputFilePath);
        updateSalaries(inputFilePath, outputFilePath);
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                String[] header = {"ID", "Name", "Department", "Salary"};
                String[] emp1 = {"101", "Kanishk", "Engineering", "60000"};
                String[] emp2 = {"102", "Ayush", "IT", "50000"};
                String[] emp3 = {"103", "Ritik", "Marketing", "55000"};
                String[] emp4 = {"104", "Krishna", "IT", "70000"};
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

    private static void updateSalaries(String inputFilePath, String outputFilePath) {
        List<String[]> data = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(inputFilePath))) {
            String[] nextLine;
            boolean firstRow = true;

            while ((nextLine = reader.readNext()) != null) {
                if (firstRow) {
                    data.add(nextLine); // Add header row as is
                    firstRow = false;
                } else {
                    if (nextLine[2].equalsIgnoreCase("IT")) {
                        int salary = Integer.parseInt(nextLine[3]);
                        salary += salary * 0.10; // Increase salary by 10%
                        nextLine[3] = String.valueOf(salary);
                    }
                    data.add(nextLine);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
            return;
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))) {
            writer.writeAll(data);
            System.out.println("Updated CSV file created: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error writing CSV file.");
            e.printStackTrace();
        }
    }
}
