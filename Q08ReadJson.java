package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Q08ReadJson {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("data.json");
            JsonNode rootNode = objectMapper.readTree(file);

            printJson(rootNode, "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printJson(JsonNode node, String parentKey) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printJson(entry.getValue(), parentKey.isEmpty() ? entry.getKey() : parentKey + "." + entry.getKey());
            }
        } else if (node.isArray()) {
            for (int i = 0; i < node.size(); i++) {
                printJson(node.get(i), parentKey + "[" + i + "]");
            }
        } else {
            System.out.println(parentKey + ": " + node.asText());
        }
    }
}
