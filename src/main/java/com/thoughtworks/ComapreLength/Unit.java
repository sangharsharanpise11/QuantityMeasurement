package com.thoughtworks.ComapreLength;

import java.util.ArrayList;
import java.util.List;

public enum Unit {
    Feet(12),
    Inch(1),
    Yard(36),
    Liter(1),
    Gallon(3.78);

    public List<Unit> getVolumeUnits() {
        List<Unit> volumeUnits = new ArrayList<>();
        volumeUnits.add(Unit.Gallon);
        volumeUnits.add(Unit.Liter);
        return volumeUnits;
    }
    public List<Unit> getLengthUnits() {
        List<Unit> lengthUnits = new ArrayList<>();
        lengthUnits.add(Unit.Feet);
        lengthUnits.add(Unit.Inch);
        lengthUnits.add(Unit.Yard);
        return lengthUnits;
    }

    private double conversionFactor;

    Unit(final double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return conversionFactor * value;
    }
}