package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class Q01_ReadCsv {
    public static void main(String[] args) {
        String filePath = "src/main/data.csv";
        readCSVFile(filePath);
    }

    private static void readCSVFile(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            System.out.println("ID | Name | Age | Marks");

            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine[0] + " | " + nextLine[1] + " | " + nextLine[2] + " | " + nextLine[3]);
            }
        }
        catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
