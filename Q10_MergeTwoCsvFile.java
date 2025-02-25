package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

public class Q10_MergeTwoCsvFile {
    public static void main(String[] args) {
        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String mergedFile = "merged_students.csv";

        createCSVFile1(file1);
        createCSVFile2(file2);
        mergeCSVFiles(file1, file2, mergedFile);
    }

    private static void createCSVFile1(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                writer.println("ID,Name,Age");
                writer.println("101,Kanishk,20");
                writer.println("102,Ayush,21");
                writer.println("103,Ritik,19");
                writer.println("104,Krishna,22");
                writer.println("105,Abhishek,20");

                System.out.println("Created " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createCSVFile2(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
                writer.println("ID,Marks,Grade");
                writer.println("101,85,A");
                writer.println("102,78,B");
                writer.println("103,90,A+");
                writer.println("104,88,A");
                writer.println("105,75,C");

                System.out.println("Created " + filePath);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void mergeCSVFiles(String file1, String file2, String mergedFile) {
        Map<String, String[]> dataMap = new HashMap<>();

        try (CSVReader reader1 = new CSVReader(new FileReader(file1))) {
            String[] nextLine;
            reader1.readNext(); // Skip header
            while ((nextLine = reader1.readNext()) != null) {
                dataMap.put(nextLine[0], nextLine);
            }
        }
        catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        try (CSVReader reader2 = new CSVReader(new FileReader(file2))) {
            reader2.readNext(); // Skip header
            String[] nextLine;
            while ((nextLine = reader2.readNext()) != null) {
                if (dataMap.containsKey(nextLine[0])) {
                    String[] student1 = dataMap.get(nextLine[0]);
                    String[] merged = {student1[0], student1[1], student1[2], nextLine[1], nextLine[2]};
                    dataMap.put(nextLine[0], merged);
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(mergedFile))) {
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});
            for (String[] student : dataMap.values()) {
                writer.writeNext(student);
            }
            System.out.println("Merged file created: " + mergedFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
