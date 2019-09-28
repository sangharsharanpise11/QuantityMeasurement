package com.thoughtworks.ComapreLength;

public class Length {
    private final int value;
    private final Unit unit;


    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object another) {

        final int feetToInch = 12;

        if (this == another) {
            return true;
        }
        if (!(another instanceof Length)) {
            return false;
        }

        Length that = (Length) another;
        if (this.value == ((Length) another).value && this.unit == ((Length) another).unit) {
            return true;
        }

        if (this.value >= 0 && that.value == this.value * feetToInch && this.unit != ((Length) another).unit) {
            return true;
        }

        if (this.value >= 12 && that.value == this.value * 1 / feetToInch) {
            return true;
        }
        return false;
    }
}