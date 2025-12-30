package com.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorAddTest {

    @Test
    public void testAddPositiveNumbers() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(4, 6));
    }
}
