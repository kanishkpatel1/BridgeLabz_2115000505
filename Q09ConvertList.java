package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Car3 {
    private String name;
    private String color;

    public Car3(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

public class Q09ConvertList {
    public static void main(String[] args) {
        List<Car3> cars = Arrays.asList(
                new Car3("Swift", "White"),
                new Car3("Tesla", "Red"),
                new Car3("BMW", "Blue")
        );

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonArray = objectMapper.writeValueAsString(cars);
            System.out.println(jsonArray);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

