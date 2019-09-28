package com.thoughtworks.ComapreLength;

public class Length {
    private final int value;

    enum Unit {
        Feet, Inch
    }

    public Length(int value, Unit unit) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Length) {
            Length that = (Length) object;
            return this.value == that.value;
        }
        if (this == object) {
            return true;
        }
        return false;

    }
}