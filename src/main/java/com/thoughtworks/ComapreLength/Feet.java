package com.thoughtworks.ComapreLength;

public class Feet {
    private final int value;

    public Feet(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Feet) {
            Feet that = (Feet) object;
            return this.value == that.value;
        }
        return false;
    }
}