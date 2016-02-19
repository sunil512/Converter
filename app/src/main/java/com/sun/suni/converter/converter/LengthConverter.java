package com.sun.suni.converter.converter;


public class LengthConverter {

    public enum Leng{

        KILOMETERS,
        MILES,
        METERS,
        CENTIMETERS,
        MILLIMETERS,
        FEET,
        INCHES,
        YARDS;

        public static Leng fromString(String text) {
            if (text != null) {
                for (Leng unit : Leng.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

  public LengthConverter(Leng from,Leng to)
    {
        double constant = 1;

        switch (from)
        {
            case KILOMETERS:
                if (to == Leng.MILES){
                    constant = 0.621371;
                }else if (to == Leng.METERS){
                    constant = 1000;
                }else if (to == Leng.CENTIMETERS){
                    constant = 100000;
                }else if (to == Leng.MILLIMETERS){
                    constant = 1000000;
                }else if (to == Leng.FEET){
                    constant = 3280.84;
                }else if (to == Leng.INCHES){
                    constant = 39370.1;
                }else if (to == Leng.YARDS){
                    constant = 1093.61;
                }
                break;
            case MILES:
                if (to == Leng.KILOMETERS){
                    constant = 1.60934;
                }else if (to == Leng.METERS){
                    constant = 1609.34;
                }else if (to == Leng.CENTIMETERS){
                    constant = 160934;
                }else if (to == Leng.MILLIMETERS){
                    constant = 1609344;
                }else if (to == Leng.FEET){
                    constant = 5280;
                }else if (to == Leng.INCHES){
                    constant = 63360;
                }else if (to == Leng.YARDS){
                    constant = 1760;
                }
                break;
            case METERS:
                if (to == Leng.KILOMETERS){
                    constant = 0.001;
                }else if (to == Leng.MILES){
                    constant = 0.000621371;
                }else if (to == Leng.CENTIMETERS){
                    constant = 100;
                }else if (to == Leng.MILLIMETERS){
                    constant = 1000;
                }else if (to == Leng.FEET){
                    constant = 3.28084;
                }else if (to == Leng.INCHES){
                    constant = 39.3701;
                }else if (to == Leng.YARDS){
                    constant = 1.09361;
                }
                break;
            case CENTIMETERS:
                if (to == Leng.KILOMETERS){
                    constant = 1e-5;
                }else if (to == Leng.MILES){
                    constant = 6.2137e-6;
                }else if (to == Leng.METERS){
                    constant = 0.01;
                }else if (to == Leng.MILLIMETERS){
                    constant = 10;
                }else if (to == Leng.FEET){
                    constant = 0.0328084;
                }else if (to == Leng.INCHES){
                    constant = 0.393701;
                }else if (to == Leng.YARDS){
                    constant = 0.0109361;
                }
                break;
            case MILLIMETERS:
                if (to == Leng.KILOMETERS){
                    constant = 1000000;
                }else if (to == Leng.MILES){
                    constant = 6.2137119e-07;
                }else if (to == Leng.METERS){
                    constant = 1000.0;
                }else if (to == Leng.CENTIMETERS){
                    constant = 0.1;
                }else if (to == Leng.FEET){
                    constant = 0.00328084;
                }else if (to == Leng.INCHES){
                    constant = 0.03937007874;
                }else if (to == Leng.YARDS){
                    constant = 0.0010936;
                }
                break;
            case FEET:
                if (to == Leng.KILOMETERS){
                    constant = 0.0003048;
                }else if (to == Leng.MILES){
                    constant = 0.000189394;
                }else if (to == Leng.METERS){
                    constant = 0.3048;
                }else if (to == Leng.CENTIMETERS){
                    constant = 30.48;
                }else if (to == Leng.MILLIMETERS){
                    constant = 304.8;
                }else if (to == Leng.INCHES){
                    constant = 12;
                }else if (to == Leng.YARDS){
                    constant = 0.333333;
                }
                break;
            case INCHES:
                if (to == Leng.KILOMETERS){
                    constant = 2.54e-5;
                }else if (to == Leng.MILES){
                    constant = 1.5783e-5;
                }else if (to == Leng.METERS){
                    constant = 0.0254;
                }else if (to == Leng.CENTIMETERS){
                    constant = 2.54;
                }else if (to == Leng.MILLIMETERS){
                    constant = 25.4;
                }else if (to == Leng.FEET){
                    constant = 0.0833333;
                }else if (to == Leng.YARDS){
                    constant = 0.0277778;
                }
                break;
            case YARDS:
                if (to == Leng.KILOMETERS){
                    constant = 0.0009144;
                }else if (to == Leng.MILES){
                    constant = 0.000568182;
                }else if (to == Leng.METERS){
                    constant = 0.9144;
                }else if (to == Leng.CENTIMETERS){
                    constant = 91.44;
                }else if (to == Leng.MILLIMETERS){
                    constant = 914.4;
                }else if (to == Leng.FEET){
                    constant = 3;
                }else if (to == Leng.INCHES){
                    constant = 36;
                }
                break;
        }

        multiplier = constant;
    }

    public double convert(double input) {
        return input * multiplier;
    }
}
