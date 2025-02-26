package org.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Q16IplCensorCSV {
    public static void main(String[] args) {
        org.example.CsvMapper csvMapper = new CsvMapper();
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            File csvFile = new File("ipl_matches.csv");
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            MappingIterator<Map<String, String>> it = csvMapper.readerFor(Map.class).with(schema).readValues(csvFile);

            List<Map<String, String>> matches = new ArrayList<>();

            while (it.hasNext()) {
                Map<String, String> match = it.next();


                match.put("team1", censorTeamName(match.get("team1")));
                match.put("team2", censorTeamName(match.get("team2")));
                match.put("winner", censorTeamName(match.get("winner")));
                match.put("player_of_match", "REDACTED");

                matches.add(match);
            }


            CsvSchema outputSchema = schema.withHeader();
            File outputFile = new File("ipl_matches_censored.csv");
            csvMapper.writer(outputSchema).writeValue(outputFile, matches);
            System.out.println("Censored CSV file created successfully!");

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
