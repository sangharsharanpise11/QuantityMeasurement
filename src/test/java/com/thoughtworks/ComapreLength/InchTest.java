package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {
    @Test
    void givenZeroAndZeroInch_whenCompare_thenTheyShouldBeEqual() {
        Inch zeroInchOne = new Inch(0);
        Inch zeroInchTwo = new Inch(0);

        assertTrue(zeroInchTwo.equals(zeroInchOne));
    }

    @Test
    void givenZeroAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Inch zeroInchOne = new Inch(0);

        assertFalse(zeroInchOne.equals(new Object()));
    }

    @Test
    void givenZeroInchAndOneInch_whenCompare_thenTheyShouldNotBeEqual() {
        Inch zeroInch = new Inch(0);
        Inch oneInch = new Inch(1);

        assertFalse(zeroInch.equals(oneInch));
    }

    @Test
    void givenZeroInchAndNull_whenCompare_thenTheyShouldNotBeEqual() {
        Inch zeroInch = new Inch(0);

        assertFalse(zeroInch.equals(null));
    }
}
