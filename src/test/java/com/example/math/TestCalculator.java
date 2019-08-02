package com.example.math;

import org.junit.*;

import static org.junit.Assert.*;

public class TestCalculator {

    private Calculator calculator;

    @Before
    public void SetUp() throws  Exception{
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void subtract() {
        assertEquals(2, calculator.subtract(8, 6));
    }

    @Test
    public void multiply() {
        assertEquals(20, calculator.multiply(10, 2));
    }
}
