package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class Q13JsonToXml {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        try {

            JsonNode jsonNode = objectMapper.readTree(new File("data.json"));


            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            System.out.println(xml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
