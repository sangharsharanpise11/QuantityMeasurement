package com.thoughtworks.ComapreLength;

public enum Unit {
    Feet(12, 2.54),
    Inch(1, 2.54);

    private double conversionFactor;
    private double conversionToCM;

    Unit(final double conversionFactor, final double conversionToCM) {
        this.conversionFactor = conversionFactor;
        this.conversionToCM = conversionToCM;
    }

    double convertToBase(double value) {
        return conversionFactor * value * conversionToCM;
    }
}
