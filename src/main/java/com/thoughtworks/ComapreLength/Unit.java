package com.thoughtworks.ComapreLength;

public enum Unit {
    Feet(12),
    Inch(1),
    Yard(36),
    Gallon(3.78),
    Liters(1);

    private double conversionFactor;

    Unit(final double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return conversionFactor * value;
    }
}