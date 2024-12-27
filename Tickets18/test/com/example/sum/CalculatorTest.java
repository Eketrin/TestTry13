package com.example.sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddWithPositiveNumbers() {
        int result = Calculator.add(3, 5);
        assertEquals(8, result, "Сумма 3 и 5 должна быть 8");
    }

    @Test
    void testAddWithNegativeNumbers() {
        int result = Calculator.add(-3, -5);
        assertEquals(-8, result, "Сумма -3 и -5 должна быть -8");
    }

    @Test
    void testAddWithPositiveAndNegativeNumber() {
        int result = Calculator.add(3, -5);
        assertEquals(-2, result, "Сумма 3 и -5 должна быть -2");
    }

    @Test
    void testAddWithZero() {
        int result = Calculator.add(0, 5);
        assertEquals(5, result, "Сумма 0 и 5 должна быть 5");
    }

    @Test
    void testAddWithLargeNumbers() {
        int result = Calculator.add(1000000, 5000000);
        assertEquals(6000000, result, "Сумма 1000000 и 5000000 должна быть 6000000");
    }
}
