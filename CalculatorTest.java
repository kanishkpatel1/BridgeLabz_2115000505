package com.lcwd.test.services;

import org.junit.*;
import java.util.Date;

public class CalculatorTest {

    int counter = 0;

    @BeforeClass
    public static void init() {
        System.out.println("Before all test cases:");
        System.out.println("Started test: " + new Date());
    }

    @Before
    public void beforeEach() {
        System.out.println("Before each test case");
        counter = 0;
    }

    @Test
    public void testAddition() {
        System.out.println("Test for addition");
        int result = Calculator.add(10, 5);
        int expected = 15;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        System.out.println("Test for subtraction");
        int result = Calculator.subtract(15, 5);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        System.out.println("Test for multiplication");
        int result = Calculator.multiply(4, 3);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        System.out.println("Test for division");
        double result = Calculator.divide(10, 2);
        double expected = 5.0;
        Assert.assertEquals(expected, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        System.out.println("Test for division by zero");
        Calculator.divide(10, 0);
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After all test cases");
        System.out.println("End test cases: " + new Date());
    }
}
