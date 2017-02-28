package com.stringcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringCalculatorTest {

    StringCalculator underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new StringCalculator();
    }

    @Test
    public void addingEmptyStringIsZero() throws Exception {
        int result = underTest.add("");
        assertThat(result, is(0));
    }

    @Test
    public void addingOneNumberReturnsTheSameNumber() throws Exception {
        StringCalculator underTest = new StringCalculator();
        int result = underTest.add("1");
        assertThat(result, is(1));
    }

    @Test
    public void addingTwoNumberReturnsTheirSum() throws Exception {
        int result = underTest.add("1,2");
        assertThat(result, is(3));
    }

    @Test
    public void addingThreeNumbersReturnsTheirSum() throws Exception {
        int result = underTest.add("1,2,3");
        assertThat(result, is(6));
    }

    @Test
    public void addingNumbersWithASkipsLetter() throws Exception {
        int result = underTest.add("1,2,3,A");
        assertThat(result, is(6));
    }
}
