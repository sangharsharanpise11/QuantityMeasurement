package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Length zeroFeetOne = new Length(0, Unit.Feet);
        Length zeroFeetTwo = new Length(0, Unit.Feet);

        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenZeroFeetAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroFeetOne = new Length(0, Unit.Feet);

        assertFalse(zeroFeetOne.equals(new Object()));
    }

    @Test
    void givenZeroFeetAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroFeet = new Length(0, Unit.Feet);
        Length oneFeet = new Length(1, Unit.Feet);

        assertFalse(zeroFeet.equals(oneFeet));
    }

    @Test
    void givenZeroFeetAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroFeet = new Length(0, Unit.Feet);

        assertFalse(zeroFeet.equals(null));
    }

    @Test
    void givenZeroInchAndZeroInch_whenCompare_thenTheyShouldBeEqual() {
        Length zeroInchOne = new Length(0, Unit.Inch);
        Length zeroInchTwo = new Length(0, Unit.Inch);

        assertTrue(zeroInchOne.equals(zeroInchTwo));
    }

    @Test
    void givenZeroInchAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroInchOne = new Length(0, Unit.Inch);

        assertFalse(zeroInchOne.equals(new Object()));
    }

    @Test
    void givenZeroInchAndOneInch_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroInch = new Length(0, Unit.Inch);
        Length oneInch = new Length(1, Unit.Inch);

        assertFalse(zeroInch.equals(oneInch));
    }

    @Test
    void givenZeroInchAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Length zeroInch = new Length(0, Unit.Inch);

        assertFalse(zeroInch.equals(null));
    }

    @Test
    void givenOneInchAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Length oneInch = new Length(1, Unit.Inch);
        Length oneFeet = new Length(1, Unit.Feet);

        assertFalse(oneFeet.equals(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Length zeroInch = new Length(0, Unit.Inch);
        Length zeroFeet = new Length(0, Unit.Feet);

        assertTrue(zeroFeet.equals(zeroInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_whenCompare_thenTheyShouldBeEqual() {
        Length oneFeet = new Length(1, Unit.Feet);
        Length twelveInch = new Length(12, Unit.Inch);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_whenCompare_thenTheyShouldBeEqual() {
        Length twoFeet = new Length(2, Unit.Feet);
        Length twentyFourInch = new Length(24, Unit.Inch);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenTwelveInchesAndOneFeet_whenCompare_thenTheyShouldBeEqual() {
        Length twelveInch = new Length(12, Unit.Inch);
        Length oneFeet = new Length(1, Unit.Feet);

        assertTrue(twelveInch.equals(oneFeet));
    }

    @Test
    void givenTwentyFourInchesAndTwoFeet_whenCompare_thenTheyShouldBeEqual() {
        Length twentyFourInche = new Length(24, Unit.Inch);
        Length twoFeet = new Length(2, Unit.Feet);

        assertTrue(twentyFourInche.equals(twoFeet));
    }

    @Test
    void givenOneYardAndAnotherOneYard_whenCompare_thenTheyShouldBeEqual() {
        Length oneYard = new Length(1, Unit.Yard);
        Length anotherOneYard = new Length(1, Unit.Yard);

        assertTrue(oneYard.equals(anotherOneYard));
    }
}