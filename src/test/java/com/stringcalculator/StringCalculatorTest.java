package com.stringcalculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringCalculatorTest {
    @Test
    public void addingEmptyStringIsZero() throws Exception {
        StringCalculator underTest = new StringCalculator();
        int result = underTest.add("");
        assertThat(result, is(0));
    }
}
