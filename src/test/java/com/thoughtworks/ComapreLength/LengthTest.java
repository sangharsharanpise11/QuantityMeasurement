package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
    @Test
    void givenZeroFeetAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Quantity zeroFeetOne = new Quantity(0, Unit.Feet);
        Quantity zeroFeetTwo = new Quantity(0, Unit.Feet);

        assertTrue(zeroFeetOne.equals(zeroFeetTwo));
    }

    @Test
    void givenZeroFeetAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroFeetOne = new Quantity(0, Unit.Feet);

        assertFalse(zeroFeetOne.equals(new Object()));
    }

    @Test
    void givenZeroFeetAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroFeet = new Quantity(0, Unit.Feet);
        Quantity oneFeet = new Quantity(1, Unit.Feet);

        assertFalse(zeroFeet.equals(oneFeet));
    }

    @Test
    void givenZeroFeetAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroFeet = new Quantity(0, Unit.Feet);

        assertFalse(zeroFeet.equals(null));
    }

    @Test
    void givenZeroInchAndZeroInch_whenCompare_thenTheyShouldBeEqual() {
        Quantity zeroInchOne = new Quantity(0, Unit.Inch);
        Quantity zeroInchTwo = new Quantity(0, Unit.Inch);

        assertTrue(zeroInchOne.equals(zeroInchTwo));
    }

    @Test
    void givenZeroInchAndAnotherObject_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroInchOne = new Quantity(0, Unit.Inch);

        assertFalse(zeroInchOne.equals(new Object()));
    }

    @Test
    void givenZeroInchAndOneInch_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.Inch);
        Quantity oneInch = new Quantity(1, Unit.Inch);

        assertFalse(zeroInch.equals(oneInch));
    }

    @Test
    void givenZeroInchAndNullFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.Inch);

        assertFalse(zeroInch.equals(null));
    }

    @Test
    void givenOneInchAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneFeet = new Quantity(1, Unit.Feet);

        assertFalse(oneFeet.equals(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenCompare_thenTheyShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.Inch);
        Quantity zeroFeet = new Quantity(0, Unit.Feet);

        assertTrue(zeroFeet.equals(zeroInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_whenCompare_thenTheyShouldBeEqual() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity twelveInch = new Quantity(12, Unit.Inch);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_whenCompare_thenTheyShouldBeEqual() {
        Quantity twoFeet = new Quantity(2, Unit.Feet);
        Quantity twentyFourInch = new Quantity(24, Unit.Inch);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenTwelveInchesAndOneFeet_whenCompare_thenTheyShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.Inch);
        Quantity oneFeet = new Quantity(1, Unit.Feet);

        assertTrue(twelveInch.equals(oneFeet));
    }

    @Test
    void givenTwentyFourInchesAndTwoFeet_whenCompare_thenTheyShouldBeEqual() {
        Quantity twentyFourInche = new Quantity(24, Unit.Inch);
        Quantity twoFeet = new Quantity(2, Unit.Feet);

        assertTrue(twentyFourInche.equals(twoFeet));
    }

    @Test
    void givenOneYardAndAnotherOneYard_whenCompare_thenTheyShouldBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.Yard);
        Quantity anotherOneYard = new Quantity(1, Unit.Yard);

        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenOneYardAndZeroYard_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.Yard);
        Quantity zeroYard = new Quantity(0, Unit.Yard);

        assertFalse(oneYard.equals(zeroYard));
    }

    @Test
    void givenOneYardAndOneFeet_whenCompare_thenTheyShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.Yard);
        Quantity oneFeet = new Quantity(1, Unit.Feet);

        assertFalse(oneYard.equals(oneFeet));
    }

    @Test
    void givenTwoInchAndTwoInch_whenEquals_thenTheyShouldBeFourInch() {
        Quantity twoInch = new Quantity(2, Unit.Inch);
        Quantity anotherTwoInch = new Quantity(2, Unit.Inch);

        assertEquals(new Quantity(4, Unit.Inch), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOnefeetAndOneInch_whenAdded_thenTheyShouldBeThirteenInch() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity oneInch = new Quantity(1, Unit.Inch);

        assertEquals(new Quantity(13, Unit.Inch), oneFeet.add(oneInch));
    }

    @Test
    void givenOnefeetAndTwoInch_whenAdded_thenTheyShouldBeFourteenInches() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity twoInch = new Quantity(2, Unit.Inch);

        assertEquals(new Quantity(14, Unit.Inch), oneFeet.add(twoInch));
    }

    @Test
    void giventwoFeetAndTwoFeet_whenAdded_thenTheyShouldBeTwentyFourInches() {
        Quantity twoFeet = new Quantity(1, Unit.Feet);
        Quantity twoInch = new Quantity(2, Unit.Inch);

        assertEquals(new Quantity(14, Unit.Inch), twoFeet.add(twoInch));
    }

    @Test
    void giventOneGallonAndAnotherOneGallon_whenAdded_thenTheyShouldBeTwoGallon() {
        Quantity oneGallon = new Quantity(1, Unit.Gallon);
        Quantity anotherOneGallon = new Quantity(1, Unit.Gallon);

        assertEquals(new Quantity(2, Unit.Gallon), oneGallon.add(anotherOneGallon));
    }

    @Test
    void giventOneGallonAndThreePointSeventyEightLiters_whenEquals_thenTheyShouldBeEqual() {
        Quantity oneGallon = new Quantity(1, Unit.Gallon);
        Quantity threePointSevenEightLiters = new Quantity(3.78, Unit.Liters);

        assertEquals(oneGallon, threePointSevenEightLiters);
    }

    @Test
    void givenOneFeetAndOneGallon_whenAdd_thenTheyShouldThrowAnException() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertThrows(IllegalArgumentException.class, () -> oneFeet.add(oneGallon));
    }

    @Test
    void givenOneFeetAndOneLiter_whenAdd_thenTheyShouldThrowAnException() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity oneLiter = new Quantity(1, Unit.Liters);

        assertThrows(IllegalArgumentException.class, () -> oneFeet.add(oneLiter));
    }

    @Test
    void givenOneInchAndOneGallon_whenAdd_thenTheyShouldThrowAnException() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertThrows(IllegalArgumentException.class, () -> oneInch.add(oneGallon));
    }
}