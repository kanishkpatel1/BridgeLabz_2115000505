package org.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Q14CsvToJson {
    public static void main(String[] args) {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File csvFile = new File("data.csv");
            MappingIterator<Object> it = csvMapper.readerFor(Object.class)
                    .with(csvSchema)
                    .readValues(csvFile);

            List<Object> jsonList = it.readAll();
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonList);

            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
