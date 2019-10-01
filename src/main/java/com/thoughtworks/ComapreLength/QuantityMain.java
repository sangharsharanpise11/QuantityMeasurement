package com.thoughtworks.ComapreLength;

public class QuantityMain {
    public static void main(String[] args) throws InvalidArgumentUnitException {
        Quantity twoFeet = new Quantity(2, Unit.Feet);
        Quantity oneGallon = new Quantity(1, Unit.Gallon);
        Quantity result = null;
        result = twoFeet.add(oneGallon);
//            System.out.println(exception + ":" + "because:" + " <Arguments Unit Types are Different < " + twoFeet.unit.baseUnit() + " and " + oneGallon.unit.baseUnit() + " >>");

//            System.out.println(exception+exception.getMessage());
    }
}