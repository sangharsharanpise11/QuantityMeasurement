package com.thoughtworks.ComapreLength;

public class QuantityMain {
    public static void main(String[] args) throws InvalidArgumentUnitException {
        Quantity twoFeet = new Quantity(2, Unit.Feet);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);
        Quantity result = null;
        result = twoFeet.add(oneGallon);
    }
}