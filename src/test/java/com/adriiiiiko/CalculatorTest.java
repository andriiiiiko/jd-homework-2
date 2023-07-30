package com.adriiiiiko;

import com.andriiiiiko.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @BeforeEach
    public void startTime() {
        System.out.println("Test started at: " + System.currentTimeMillis());
    }

    @AfterEach
    public void endTime() {
        System.out.println("Test finished at: " + System.currentTimeMillis());
    }

    @Test
    public void testAdd() {
        // Given
        double a = 2.5;
        double b = 3.5;

        // When
        double result = Calculator.add(a, b);

        // Then
        assertEquals(6, result);
    }

    @Test
    public void testSub() {
        // Given
        double a = 7.25;
        double b = 2.25;

        // When
        double result = Calculator.sub(a, b);

        // Then
        assertEquals(5, result);
    }

    @Test
    public void testMul() {
        // Given
        double a = 2.5;
        double b = 3;

        // When
        double result = Calculator.mul(a, b);

        // Then
        assertEquals(7.5, result);
    }

    @Test
    public void testDiv() {
        // Given
        double a = 5;
        double b = 2;

        // When
        double result = Calculator.div(a, b);

        // Then
        assertEquals(2.5, result);
    }

    @Test
    public void testDivisionByZero() {
        // Given
        double a = 5;
        double b = 0;

        // When & Then
        assertThrows(IllegalArgumentException.class, () -> Calculator.div(a, b));
    }
}
