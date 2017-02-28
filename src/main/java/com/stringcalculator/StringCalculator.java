package com.stringcalculator;

public class StringCalculator {
    public int add(String operands) {

        if (operands.isEmpty()) {
            return 0;
        }
        return Integer.valueOf(operands);
    }
}
