
package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Car1 {
    private String name;
    private String color;

    public Car1(String name, String color) {
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

public class Q06ConvertListToObject {
    public static void main(String[] args) {
        List<Car1> cars = Arrays.asList(
                new Car1("Swift", "White"),
                new Car1("Tesla", "Red"),
                new Car1("BMW", "Blue")
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

