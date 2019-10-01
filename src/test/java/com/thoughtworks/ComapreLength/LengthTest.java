package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.ComapreLength.Unit.Gallon;
import static com.thoughtworks.ComapreLength.Unit.Liter;
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

    @Disabled
    void givenOneGallonAndAnotherOneGallon_whenAdded_thenTheyShouldBeTwoGallon() {
        Quantity oneGallon = new Quantity(1, Unit.Gallon);
        Quantity anotherOneGallon = new Quantity(1, Unit.Gallon);

        assertEquals(new Quantity(2, Unit.Gallon), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneGallonAndThreePointSeventyEightLiters_whenEquals_thenTheyShouldBeEqual() {
        Quantity oneGallon = new Quantity(1, Unit.Gallon);
        Quantity threePointSevenEightLiters = new Quantity(3.78, Liter);

        assertEquals(oneGallon, threePointSevenEightLiters);
    }

    @Test
    void givenOneFeetAndOneGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertNotEquals(oneFeet, oneGallon);
    }

    @Test
    void givenOneInchAndOneLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneLiter = new Quantity(1, Unit.Liter);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenOneInchAndOneLiter_whenCheckingEquality_thenTheyShouldBeNotEqual2() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneLiter = new Quantity(1, Unit.Liter);

        assertNotEquals(oneLiter, oneInch);
    }

    @Test
    void givenOneFeetAndOneLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity oneYard = new Quantity(1, Unit.Inch);
        Quantity oneLiter = new Quantity(1, Unit.Liter);

        assertNotEquals(oneYard, oneLiter);
    }

    @Test
    void givenOneInchAndOneGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneYardAndOneGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity oneYard = new Quantity(1, Unit.Yard);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertNotEquals(oneYard, oneGallon);
    }

    @Test
    void givenOneYardAndOneLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity oneYard = new Quantity(1, Unit.Yard);
        Quantity oneLiter = new Quantity(1, Unit.Liter);

        assertNotEquals(oneYard, oneLiter);
    }

    @Test
    void givenZeroFeetAndZeroGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroFeet = new Quantity(0, Unit.Feet);
        Quantity zeroGallon = new Quantity(0, Unit.Gallon);

        assertFalse(zeroFeet.equals(zeroGallon));
    }

    @Test
    void givenZeroFeetAndZeroLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroFeet = new Quantity(0, Unit.Feet);
        Quantity zeroLiter = new Quantity(0, Unit.Liter);

        assertNotEquals(zeroFeet, zeroLiter);
    }

    @Test
    void givenZeroInchAndZeroGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroInch = new Quantity(0, Unit.Inch);
        Quantity zeroGallon = new Quantity(0, Unit.Gallon);

        assertNotEquals(zeroInch, zeroGallon);
    }

    @Test
    void givenZeroInchAndZeroLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroInch = new Quantity(0, Unit.Inch);
        Quantity zeroLiter = new Quantity(0, Liter);

        assertNotEquals(zeroInch, zeroLiter);
    }

    @Test
    void givenZeroYardAndZeroGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroYard = new Quantity(0, Unit.Yard);
        Quantity zeroGallon = new Quantity(0, Unit.Gallon);

        assertNotEquals(zeroYard, zeroGallon);
    }

    @Test
    void givenZeroYardAndZeroLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroYard = new Quantity(0, Unit.Yard);
        Quantity zeroLiter = new Quantity(0, Unit.Liter);

        assertNotEquals(zeroYard, zeroLiter);
    }

    @Test
    void givenZeroCMAndZeroLiter_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroCM = new Quantity(0, Unit.Centimetre);
        Quantity zeroLiter = new Quantity(0, Unit.Liter);

        assertNotEquals(zeroCM, zeroLiter);
    }

    @Test
    void givenZeroCMAndZeroGallon_whenCheckingEquality_thenTheyShouldBeNotEqual() {
        Quantity zeroCM = new Quantity(0, Unit.Centimetre);
        Quantity zeroGallon = new Quantity(0, Unit.Gallon);

        assertNotEquals(zeroCM, zeroGallon);
    }

    @Test
    void givenOneFeetAndOneGallon_whenAdding_thenTheyShouldThrowException() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertThrows(IllegalArgumentException.class, () -> oneFeet.add(oneGallon));
    }

    @Test
    void givenOneInchAndOneGallon_whenAdding_thenTheyShouldThrowException() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertThrows(IllegalArgumentException.class, () -> oneInch.add(oneGallon));
    }
    @Test
    void givenOneYardAndOneGallon_whenAdding_thenTheyShouldThrowException() {
        Quantity oneyard = new Quantity(1, Unit.Yard);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertThrows(IllegalArgumentException.class, () -> oneyard.add(oneGallon));
    }
    @Test
    void givenOneCentimeterAndOneGallon_whenAdding_thenTheyShouldThrowException() {
        Quantity oneCentimeter = new Quantity(1, Unit.Centimetre);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);

        assertThrows(IllegalArgumentException.class, () -> oneCentimeter.add(oneGallon));
    }

    @Test
    void givenOneFeetAndOneLiter_whenAdding_thenTheyShouldThrowException() {
        Quantity oneFeet = new Quantity(1, Unit.Feet);
        Quantity oneLiter = new Quantity(1, Liter);

        assertThrows(IllegalArgumentException.class, () -> oneFeet.add(oneLiter));
    }

    @Test
    void givenOneInchAndOneLiter_whenAdding_thenTheyShouldThrowException() {
        Quantity oneInch = new Quantity(1, Unit.Inch);
        Quantity oneLiter = new Quantity(1, Liter);

        assertThrows(IllegalArgumentException.class, () -> oneInch.add(oneLiter));
    }

    @Test
    void givenOneYardAndOneLiter_whenAdding_thenTheyShouldThrowException() {
        Quantity oneYard = new Quantity(1, Unit.Yard);
        Quantity oneLiter = new Quantity(1, Liter);

        assertThrows(IllegalArgumentException.class, () -> oneYard.add(oneLiter));
    }

    @Test
    void givenOneCentimeterAndOneLiter_whenAdding_thenTheyShouldThrowException() {
        Quantity oneCentimetre = new Quantity(1, Unit.Centimetre);
        Quantity oneLiter = new Quantity(1, Liter);

        assertThrows(IllegalArgumentException.class, () -> oneCentimetre.add(oneLiter));
    }
}


