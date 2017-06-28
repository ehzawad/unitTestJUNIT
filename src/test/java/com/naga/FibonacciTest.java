package com.naga;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void evaluatesExpression() {
        Fibonacci calculator = new Fibonacci();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}