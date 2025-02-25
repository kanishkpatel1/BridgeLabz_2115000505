



package com.lcwd.test;

import java.io.*;

public class Q11_ReadLargeFile {
    public static void main(String[] args) {
        String filePath = "large_data.csv";
        processLargeCSV(filePath);
    }

    private static void processLargeCSV(String filePath) {
        int batchSize = 100;
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                totalRecords++;

                if (totalRecords % batchSize == 0) {
                    System.out.println("We have Processed " + totalRecords + " records");
                }
            }
            System.out.println("Total records processed: " + totalRecords);
        }
        catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}
