package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetTest {
    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Feet zeroFeetOne = new Feet(0);
        Feet zeroFeetTwo = new Feet(0);

        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenZeroFeetAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Feet zeroFeetOne = new Feet(0);

        assertFalse(zeroFeetOne.equals(new Object()));
    }

    @Test
    void givenZeroFeetAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Feet zeroFeet = new Feet(0);
        Feet oneFeet = new Feet(1);

        assertFalse(zeroFeet.equals(oneFeet));
    }

    @Test
    void givenZeroFeetAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Feet zeroFeet = new Feet(0);

        assertFalse(zeroFeet.equals(null));
    }
}