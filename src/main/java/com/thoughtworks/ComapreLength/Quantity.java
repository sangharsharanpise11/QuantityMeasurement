package com.thoughtworks.ComapreLength;

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
        if (another instanceof Quantity) {
            Quantity that = (Quantity) another;
            return this.unit.convertToBase(value) == that.unit.convertToBase(that.value);
        }
        return false;
    }

    public Quantity add(Quantity other) {
        if ((this.unit == Unit.Feet && other.unit == Unit.Gallon || other.unit == Unit.Liters) || (this.unit == Unit.Inch && other.unit == Unit.Gallon)) {
            throw new IllegalArgumentException();
        }
        return new Quantity(this.unit.convertToBase(this.value) + other.unit.convertToBase(other.value), Unit.Inch);
    }
}