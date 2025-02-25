package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class Q03_ReadAndCount {
    public static void main(String[] args) {
        String filePath = "data.csv";
        readAndCountCSV(filePath);
    }

    private static void readAndCountCSV(String filePath) {
        int rowCount = 0;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            while (reader.readNext() != null) {
                rowCount++;
            }
            System.out.println("Total records (excluding header): " + rowCount);
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
