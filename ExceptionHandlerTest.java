/* ===================== ExceptionHandlerTest.java ===================== */
package com.lcwd.test.exceptions;

import org.junit.*;

public class ExceptionHandlerTest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        ExceptionHandler.divide(10, 0);
    }

    @Test
    public void testValidDivision() {
        int result = ExceptionHandler.divide(20, 5);
        Assert.assertEquals(4, result);
    }
}
