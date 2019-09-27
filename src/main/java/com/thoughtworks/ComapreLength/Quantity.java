package com.thoughtworks.ComapreLength;

public class Quantity {
    private final int value;

    public Quantity(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Quantity;
    }
}
