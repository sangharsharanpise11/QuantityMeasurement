package com.thoughtworks.ComapreLength;

public enum Unit {
    Feet(12),
    Inch(1);

    private double conversionFactor;

    Unit(final double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    double convertToBase(double value) {
        return conversionFactor * value;
    }
}
