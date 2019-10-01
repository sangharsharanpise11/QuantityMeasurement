package com.thoughtworks.ComapreLength;

public class Quantity {
    public final double value;
    public final Unit unit;

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

        if (!this.unit.type.equals(that.unit.type)) {
            return false;
        }

        return this.unit.convertToBase(value) == that.unit.convertToBase(that.value);
    }

    public Quantity add(Quantity other) {
        if (this.unit.type != other.unit.type) throw new IllegalArgumentException();
        return new Quantity(this.unit.convertToBase(this.value) + other.unit.convertToBase(other.value), unit.Inch);
    }
}