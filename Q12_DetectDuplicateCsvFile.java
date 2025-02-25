
package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

public class Q12_DetectDuplicateCsvFile {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        detectDuplicateRecords(filePath);
    }

    private static void detectDuplicateRecords(String filePath) {
        Map<String, String> recordMap = new HashMap<>();
        Set<String> duplicateIds = new HashSet<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                String id = nextLine[0];

                if (recordMap.containsKey(id)) {
                    duplicateIds.add(id);
                }
                else {
                    recordMap.put(id, String.join(", ", nextLine));
                }
            }

            if (duplicateIds.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate records found:");
                for (String id : duplicateIds) {
                    System.out.println(recordMap.get(id));
                }
            }
        }
        catch (IOException | CsvValidationException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}
