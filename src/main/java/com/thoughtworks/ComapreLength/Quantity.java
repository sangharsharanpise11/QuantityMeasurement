package com.thoughtworks.ComapreLength;

import java.util.ArrayList;
import java.util.List;

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

        if ((this.unit.getLengthUnits().contains(this.unit) && this.unit.getVolumeUnits().contains(that.unit))) return false;
        if ((this.unit.getVolumeUnits().contains(this.unit) && this.unit.getLengthUnits().contains(that.unit))) return false;

        return this.unit.convertToBase(value) == that.unit.convertToBase(that.value);
    }

    public Quantity add(Quantity other) {
        return new Quantity(this.unit.convertToBase(this.value) + other.unit.convertToBase(other.value), unit.Inch);
    }
}