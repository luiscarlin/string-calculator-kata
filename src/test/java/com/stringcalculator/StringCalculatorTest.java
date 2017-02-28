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

    @Test
    public void addingWithNonNumbersSkipsNonNumbers() throws Exception {
        int result = underTest.add("1,,,%,5%,7,2");
        assertThat(result, is(10));
    }

    @Test
    public void addingTenNumbersReturnsTheirSum() throws Exception {
        int result = underTest.add("1,2,3,4,5,6,7,8,9,10");
        assertThat(result, is(55));
    }

    @Test
    public void addingTrimsLeadingAndTrailingSpaces() throws Exception {
        int result = underTest.add("1, 2, 4 , 5");
        assertThat(result, is(12));
    }

    @Test
    public void addingTrimsEndOfLines() throws Exception {
        int result = underTest.add("\n1\n,\n2,4\n");
        assertThat(result, is(7));
    }

    @Test
    public void addingTrimsTabs() throws Exception {
        int result = underTest.add("    1   ,   2,4     ");
        assertThat(result, is(7));
    }

    @Test
    public void addingSupportsAsteriskAsDelimiter() throws Exception {
        int result = underTest.add("1*2*3", "*");
        assertThat(result, is(6));
    }

    @Test
    public void addingSupportsSpacesAsDelimiters() throws Exception {
        int result = underTest.add("1 3 4   5    6", " ");
        assertThat(result, is(19));
    }
}
