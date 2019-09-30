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
            if (this.unit==Unit.Feet && ((Quantity) another).unit==Unit.Gallon || this.unit==Unit.Feet && ((Quantity) another).unit==Unit.Liter)return false;
            if (this.unit==Unit.Inch && ((Quantity) another).unit==Unit.Gallon )return false;

            if (this.unit == Unit.Inch && ((Quantity) another).unit == Unit.Liter || this.unit==Unit.Liter && ((Quantity) another).unit==Unit.Inch) return false;
            if (this.unit.convertToBase(value) == that.unit.convertToBase(that.value)) return true;
            else return false;
        }
        return false;
    }

    public Quantity add(Quantity other) {
        return new Quantity(this.unit.convertToBase(this.value) + other.unit.convertToBase(other.value), Unit.Inch);
    }
}