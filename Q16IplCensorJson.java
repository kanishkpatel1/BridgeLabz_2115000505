package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class Q16IplCensorJson
{
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read JSON file
            File inputFile = new File("ipl.json");
            JsonNode rootArray = objectMapper.readTree(inputFile);

            // Censor data
            for (JsonNode match : rootArray) {
                ((ObjectNode) match).put("team1", censorTeamName(match.get("team1").asText()));
                ((ObjectNode) match).put("team2", censorTeamName(match.get("team2").asText()));
                ((ObjectNode) match).put("winner", censorTeamName(match.get("winner").asText()));
                ((ObjectNode) match).put("player_of_match", "REDACTED");
            }


            File outputFile = new File("ipl_matches_censored.json");
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, rootArray);
            System.out.println("Censored JSON file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String censorTeamName(String teamName) {
        String[] parts = teamName.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return teamName;
    }
}
