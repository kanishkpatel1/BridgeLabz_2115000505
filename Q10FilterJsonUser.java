package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q10FilterJsonUser {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("users.json");
            JsonNode rootArray = objectMapper.readTree(file);

            List<JsonNode> filteredUsers = new ArrayList<>();
            for (JsonNode node : rootArray) {
                if (node.has("age") && node.get("age").asInt() > 25) {
                    filteredUsers.add(node);
                }
            }

            String filteredJson = objectMapper.writeValueAsString(filteredUsers);
            System.out.println(filteredJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
