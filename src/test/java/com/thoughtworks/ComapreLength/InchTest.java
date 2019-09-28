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
}
