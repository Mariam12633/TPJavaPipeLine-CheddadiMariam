package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-4, calc.add(-2, -2));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-3, calc.subtract(0, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(5, 0));
        assertEquals(-6, calc.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calc.divide(5, 2));
        assertEquals(3.0, calc.divide(9, 3));
    }

    @Test
    void testDivideByZeroThrowsException() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calc.divide(10, 0)
        );
        assertEquals("Division par zéro interdite", ex.getMessage());
    }
}