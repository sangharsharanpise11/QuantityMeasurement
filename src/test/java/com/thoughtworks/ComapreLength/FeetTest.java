package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FootTest {
    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Foot zeroFeetOne = new Foot(0);
        Foot zeroFeetTwo = new Foot(0);

        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenZeroFeetAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Foot zeroFeetOne = new Foot(0);

        assertFalse(zeroFeetOne.equals(new Object()));
    }

    @Test
    void givenZeroFeetAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Foot zeroFeet = new Foot(0);
        Foot oneFeet = new Foot(1);

        assertFalse(zeroFeet.equals(oneFeet));
    }

    @Test
    void givenZeroFeetAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Foot zeroFeet = new Foot(0);

        assertFalse(zeroFeet.equals(null));
    }
}