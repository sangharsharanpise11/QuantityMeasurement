package com.thoughtworks.ComapreLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {
    @Test
    void givenZeroFeetAndZeroInches_whenCompare_thenTheyShouldBeEqual() {

        Quantity Zero = new Quantity(0);

        assertTrue(Zero.compare(Zero));
    }
}
