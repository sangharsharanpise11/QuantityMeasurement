package com.thoughtworks.ComapreLength;

public class Inch {
    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Inch) {
            return true;
        }
        return false;
    }
}
