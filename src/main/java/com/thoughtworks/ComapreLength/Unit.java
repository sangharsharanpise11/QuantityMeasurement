package com.thoughtworks.ComapreLength;

public enum Unit {
    Feet(12, UnitType.Length),
    Inch(1, UnitType.Length),
    Yard(36, UnitType.Length),
    Liter(1, UnitType.Volume),
    Gallon(3.78, UnitType.Volume);

    enum UnitType {
        Length, Volume;
    }

    private double conversionFactor;
    public UnitType type;

    Unit(final double conversionFactor, UnitType type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public double convertToBase(double value) {
        return conversionFactor * value;
    }
}