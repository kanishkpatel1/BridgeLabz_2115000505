/* ===================== DateFormatterTest.java ===================== */
package com.lcwd.test.utils;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;

public class DateFormatterTest {

    @Test
    public void testValidDateFormatting() throws ParseException {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2024", DateFormatter.formatDate("2024-01-01"));
    }

    @Test
    public void testInvalidDateFormatting() {
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("2023/12/25"));
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("25-12-2023"));
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("invalid-date"));
    }
}
