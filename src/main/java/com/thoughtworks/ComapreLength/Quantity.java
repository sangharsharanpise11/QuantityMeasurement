package com.thoughtworks.ComapreLength;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        this.value = value;
    }

    public boolean equals(Object object) {
        Quantity that = (Quantity) object;
        return this.value == that.value;
    }
}
