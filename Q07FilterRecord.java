package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q07FilterRecord {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("data2.json");
            JsonNode rootArray = objectMapper.readTree(file);

            List<JsonNode> filteredList = new ArrayList<>();
            for (JsonNode node : rootArray) {
                if (node.has("age") && node.get("age").asInt() > 25) {
                    filteredList.add(node);
                }
            }

            String filteredJson = objectMapper.writeValueAsString(filteredList);
            System.out.println(filteredJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
