package com.stringcalculator;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringCalculator {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringCalculator.class);

    public int add(String operands) {
        List<String> parsedOperands = Arrays.asList(operands.split(","));

        int sum = 0;

        for (String operand: parsedOperands) {
            try {
                sum += Integer.valueOf(operand);
            }
            catch(NumberFormatException e) {
                LOGGER.info("Skipping operand='{}' as it is not a number.", operand);
            }
        }
        return sum;
    }
}
