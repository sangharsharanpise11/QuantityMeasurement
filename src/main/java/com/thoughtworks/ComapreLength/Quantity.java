package com.thoughtworks.ComapreLength;

import java.util.ArrayList;

public class Quantity {
    private final double value;
    private final Unit unit;


    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;

    }

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (!(another instanceof Quantity)) {
            return false;
        }
        Quantity that = (Quantity) another;

        ArrayList<Unit> volumeUnits = new ArrayList<>();
        volumeUnits.add(Unit.Gallon);
        volumeUnits.add(Unit.Liter);

        ArrayList<Unit> lengthUnits = new ArrayList<>();
        lengthUnits.add(Unit.Feet);
        lengthUnits.add(Unit.Inch);
        lengthUnits.add(Unit.Yard);

        if ((lengthUnits.contains(this.unit) && volumeUnits.contains(that.unit))) return false;
        if ((volumeUnits.contains(this.unit) && lengthUnits.contains(that.unit))) return false;

        return this.unit.convertToBase(value) == that.unit.convertToBase(that.value);
    }

    public Quantity add(Quantity other) {
        return new Quantity(this.unit.convertToBase(this.value) + other.unit.convertToBase(other.value), unit.Inch);

    }
}