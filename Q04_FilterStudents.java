package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q04_FilterStudents {
    public static void main(String[] args) {
        String filePath = "data2.csv";
        createCSVFile(filePath);
        filterHighScoringStudents(filePath);
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                String[] header = {"ID", "Name", "Age", "Marks"};
                String[] student1 = {"101", "Kanishk", "20", "85"};
                String[] student2 = {"102", "Ayush", "22", "78"};
                String[] student3 = {"103", "Ritik", "21", "92"};
                String[] student4 = {"104", "Krishna", "23", "88"};
                String[] student5 = {"105", "Abhishek", "19", "75"};

                writer.writeNext(header);
                writer.writeNext(student1);
                writer.writeNext(student2);
                writer.writeNext(student3);
                writer.writeNext(student4);
                writer.writeNext(student5);

                System.out.println("CSV file created successfully: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error creating CSV file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("CSV file already exists: " + file.getAbsolutePath());
        }
    }

    private static void filterHighScoringStudents(String filePath) {
        System.out.println("Students who scored more than 80 marks:");
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                int marks = Integer.parseInt(nextLine[3]);
                if (marks > 80) {
                    System.out.println(nextLine[0] + " | " + nextLine[1] + " | " + nextLine[2] + " | " + nextLine[3]);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
