package com.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddShouldFail() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        // Intentionally wrong expected value
        assertEquals("Addition result is incorrect", 10, result);
    }
}
