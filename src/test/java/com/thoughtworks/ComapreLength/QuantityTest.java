package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {
    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Quantity zeroFeetOne = new Quantity(0);
        Quantity zeroFeetTwo = new Quantity(0);

        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenZeroFeetAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroFeetOne = new Quantity(0);

        assertFalse(zeroFeetOne.equals(new Object()));
    }

}
