package com.thoughtworks.ComapreLength;

public enum Unit {
    Feet(12),
    Inch(1),
    Yard(36),
    Gallon(3.78),
    Liters(1);

    private double conversionFactor;
    private double conversionToCM;

    Unit(final double conversionFactor) {
        this.conversionFactor = conversionFactor;

    }

    double convertToBase(double value) {
        return conversionFactor * value;
    }
}
