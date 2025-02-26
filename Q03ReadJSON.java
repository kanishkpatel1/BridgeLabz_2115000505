package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Q03ReadJSON {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("data.json");
            JsonNode rootNode = objectMapper.readTree(file);

            String name = rootNode.get("name").asText();
            String email = rootNode.get("email").asText();

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
