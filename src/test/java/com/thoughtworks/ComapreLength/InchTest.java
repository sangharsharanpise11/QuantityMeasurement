package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InchTest {
    @Test
    void givenZeroAndZeroInch_whenCompare_thenTheyShouldBeEqual() {
        Inch zeroInchOne = new Inch(0);
        Inch zeroInchTwo = new Inch(0);

        assertTrue(zeroInchOne.equals(zeroInchTwo));
    }
}
