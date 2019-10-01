package com.thoughtworks.ComapreLength;

public enum Unit {
    Inch(1),
    Feet(12, Unit.Inch),
    Yard(36, Unit.Inch),
    Centimetre(1, Unit.Inch),
    Liter(1),
    Gallon(3.78, Unit.Liter);

    private double conversionFactor;
    private Unit unit;

    Unit(final double conversionFactor, Unit unit) {
        this.conversionFactor = conversionFactor;
        this.unit = unit;
    }

    Unit(double conversionFactor) {
        this.conversionFactor=conversionFactor;
        this.unit=this;
    }

    public Unit baseUnit(){
        return unit;
    }
    public double convertToBase(double value) {
        return conversionFactor * value;
    }
}