


package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

class Student {
    int id;
    String name;
    int age;
    int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class Q14_JsonToCsvAndViceVersa  {
    static String jsonFilePath = "students.json";
    static String csvFilePath = "students.csv";

    public static void main(String[] args) {
        convertJsonToCsv();
        convertCsvToJson();
    }

    public static void convertJsonToCsv() {
        try (Reader reader = new FileReader(jsonFilePath)) {
            Gson gson = new Gson();
            Type studentListType = new TypeToken<List<Student>>() {}.getType();
            List<Student> students = gson.fromJson(reader, studentListType);

            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
                writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"});
                for (Student student : students) {
                    writer.writeNext(new String[]{
                            String.valueOf(student.id),
                            student.name,
                            String.valueOf(student.age),
                            String.valueOf(student.marks)
                    });
                }
                System.out.println("JSON converted to CSV successfully: " + csvFilePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void convertCsvToJson() {
        List<Student> students = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            String[] nextRecord;
            reader.readNext();
            while ((nextRecord = reader.readNext()) != null) {
                students.add(new Student(
                        Integer.parseInt(nextRecord[0]),
                        nextRecord[1],
                        Integer.parseInt(nextRecord[2]),
                        Integer.parseInt(nextRecord[3])
                ));
            }

            Gson gson = new Gson();
            try (Writer writer = new FileWriter("converted_students.json")) {
                gson.toJson(students, writer);
                System.out.println(" CSV converted to JSON successfully: converted_students.json");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
