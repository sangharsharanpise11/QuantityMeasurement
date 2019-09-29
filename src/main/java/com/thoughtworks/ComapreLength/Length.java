package com.thoughtworks.ComapreLength;

public class Length {
    private final double value;
    private final Unit unit;


    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (another instanceof Length) {
            Length that = (Length) another;
            return this.unit.convertToBase(value) == that.unit.convertToBase(that.value);
        }
        return false;
    }

    public Length add(Length other) {
        return new Length(this.unit.convertToBase(this.value)+other.unit.convertToBase(other.value),Unit.Inch);
    }
}