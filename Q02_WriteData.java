package com.lcwd.test;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q02_WriteData{
    public static void main(String[] args) {
        String filePath = "data.csv";
        writeCSVFile(filePath);
    }

    private static void writeCSVFile(String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] emp1 = {"101", "Kanishk", "Engineering", "60000"};
            String[] emp2 = {"102", "Ayush", "HR", "50000"};
            String[] emp3 = {"103", "Ritik", "Marketing", "55000"};
            String[] emp4 = {"104", "Krishna", "Development", "45000"};
            String[] emp5 = {"105", "Abhishek", "Finance", "65000"};

            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);

            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing CSV file.");
            e.printStackTrace();
        }
    }
}
