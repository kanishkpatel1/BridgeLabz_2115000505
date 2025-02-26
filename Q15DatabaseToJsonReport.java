package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q15DatabaseToJsonReport {
  public static void main(String[] args) {
    String jdbcURL = "jdbc:mysql://localhost:3306/testdb";
    String username = "root";
    String password = "password";

    List<Map<String, Object>> records = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();

    try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, name, email, age FROM users")) {

      while (rs.next()) {
        Map<String, Object> record = new HashMap<>();
        record.put("id", rs.getInt("id"));
        record.put("name", rs.getString("name"));
        record.put("email", rs.getString("email"));
        record.put("age", rs.getInt("age"));
        records.add(record);
      }

      String jsonOutput = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(records);
      System.out.println(jsonOutput);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
