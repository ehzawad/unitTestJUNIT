package com.naga;

/**
 * Created by hell on 6/28/17.
 */
public class Fibonacci {

    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}
