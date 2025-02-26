package org.example;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;

public class Q12MergeTwoObject {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            JsonNode jsonNode1 = objectMapper.readTree(new File("data1.json"));
            JsonNode jsonNode2 = objectMapper.readTree(new File("data2.json"));


            ObjectNode mergedJson = objectMapper.createObjectNode();
            mergedJson.setAll((ObjectNode) jsonNode1);
            mergedJson.setAll((ObjectNode) jsonNode2);


            String mergedJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson);
            System.out.println(mergedJsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

