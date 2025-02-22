/* ===================== NumberUtilsTest.java ===================== */
package com.lcwd.test.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, NumberUtils.isEven(number), "Number should be correctly identified as even or odd");
    }
}
