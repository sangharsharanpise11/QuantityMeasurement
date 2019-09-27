package com.thoughtworks.ComapreLength;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Quantity) {
            Quantity that = (Quantity) object;
            return this.value == that.value;
        }
        return false;
    }
}