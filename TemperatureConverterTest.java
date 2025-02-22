/* ===================== TemperatureConverterTest.java ===================== */
package com.lcwd.test.utils;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
    }
}
