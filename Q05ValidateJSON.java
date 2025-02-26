
package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Q05ValidateJSON {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("data.json");
            JsonNode rootNode = objectMapper.readTree(file);

            if (isValidJson(rootNode)) {
                System.out.println("JSON is valid.");
            } else {
                System.out.println("JSON is invalid.");
            }
        } catch (IOException e) {
            System.out.println("Invalid JSON format.");
        }
    }

    public static boolean isValidJson(JsonNode node) {
        return node.has("name") && node.get("name").isTextual() &&
                node.has("email") && node.get("email").isTextual() &&
                node.has("age") && node.get("age").isInt();
    }


}
