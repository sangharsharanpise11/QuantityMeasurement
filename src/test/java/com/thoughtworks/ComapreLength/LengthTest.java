package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Length zeroFeetOne = new Length(0, Length.Unit.Feet);
        Length zeroFeetTwo = new Length(0, Length.Unit.Feet);

        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenZeroFeetAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroFeetOne = new Length(0, Length.Unit.Feet);

        assertFalse(zeroFeetOne.equals(new Object()));
    }

    @Test
    void givenZeroFeetAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroFeet = new Length(0, Length.Unit.Feet);
        Length oneFeet = new Length(1, Length.Unit.Feet);

        assertFalse(zeroFeet.equals(oneFeet));
    }

    @Test
    void givenZeroFeetAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroFeet = new Length(0, Length.Unit.Feet);

        assertFalse(zeroFeet.equals(null));
    }

}