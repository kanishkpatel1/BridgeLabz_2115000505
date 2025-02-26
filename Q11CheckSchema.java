package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.File;
import java.io.FileInputStream;

public class Q11CheckSchema {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File schemaFile = new File("schema.json");
            File jsonFile = new File("data.json");

            JSONObject jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(schemaFile)));
            JSONObject jsonData = new JSONObject(new JSONTokener(new FileInputStream(jsonFile)));

            Schema schema = SchemaLoader.load(jsonSchema);
            schema.validate(jsonData);

            System.out.println("JSON is valid.");
        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
