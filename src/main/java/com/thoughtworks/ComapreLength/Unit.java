package com.thoughtworks.ComapreLength;

public enum Unit {
    Feet(){
        final double FEET_TO_INCH =12.0;
        @Override
        double convertToBase(double value) {
            return FEET_TO_INCH *value;
        }
    },
    Inch(){
        @Override
        double convertToBase(double value) {
            return value;
        }
    };
   abstract double convertToBase(double value);
}
