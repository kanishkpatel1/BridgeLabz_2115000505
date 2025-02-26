package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class Q01Student {
    public static void main(String[] args) {
        JSONObject student=new JSONObject();
        student.put("name","Kanishk");
        student.put("age",19);
        JSONArray subjects=new JSONArray();
        subjects.put("English");
        subjects.put("Hindi");
        subjects.put("Math");
        student.put("subjects",subjects);
        System.out.println(student.toString());

    }
}
