package com.labs.java.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Test Class for Calculator class
public class CalculatorTests {

    private static Calculator calculator = null;

    @BeforeAll
    public static void initializeBeforeAll() throws Exception {
        // Initialize any necessary data or resources before all test cases
        // This method is called before all test methods
        System.out.println("Initializing CalculatorTests BeforeAll...");
        calculator = new Calculator();
    }

    @AfterAll
    public static void cleanupAfterAll() throws Exception {
        // Clean up any resources after all test cases
        // This method is called after all test methods
        System.out.println("Cleaning up CalculatorTests AfterAll...");
        calculator = null;
    }

    @BeforeEach
    public void initializeBeforeEach() throws Exception {
        // Initialize any necessary data or resources before each test case
        // This method is called before each test method
        System.out.println("Initializing CalculatorTests BeforeEach...");
//        calculator = new Calculator();
    }

    @AfterEach
    public void cleanupAfterEach() throws Exception {
        // Clean up any resources after each test case
        // This method is called after each test method
        System.out.println("Cleaning up CalculatorTests AfterEach...");
//        calculator = null;
    }

    @Test
    public void givenTwoPositiveNos_WhenAdd_ThenReturnPositiveValue() {
//        System.out.println("Testing Addition...");
//        assertTrue(50 > 30);
//        assertEquals(true, 50 > 30);

//        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void givenTwoNegativeNos_WhenAdd_ThenReturnNegativeValue() {
        assertEquals(-8, calculator.add(-5, -3));
    }

    @Test
    public void testSubtract() {
//        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
//        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide() {
//        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
//        Calculator calculator = new Calculator();
        Throwable ex = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", ex.getMessage());
    }

}
