package org.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Q04MergeTwoObject {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json1 = "{ \"name\": \"Kanishk Patel\", \"email\": \"kanishkdeveshpatel@gmail.com\" }";
            String json2 = "{ \"age\": 25, \"city\": \"Mumbai\" }";

            JsonNode node1 = objectMapper.readTree(json1);
            JsonNode node2 = objectMapper.readTree(json2);

            ObjectNode mergedNode = objectMapper.createObjectNode();
            mergedNode.setAll((ObjectNode) node1);
            mergedNode.setAll((ObjectNode) node2);

            String mergedJson = objectMapper.writeValueAsString(mergedNode);
            System.out.println(mergedJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

