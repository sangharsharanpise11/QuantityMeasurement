package com.thoughtworks.ComapreLength;

public class Length {
    private final int value;
    private final Unit unit;


    public Length(int value, Unit unit) {
        this.value = value;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Length) {
            Length that = (Length) object;
            return this.value == that.value && this.unit==that.unit;
        }
        if (this == object) {
            return true;
        }
        return false;

    }
}