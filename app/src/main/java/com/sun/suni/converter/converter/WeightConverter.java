package com.sun.suni.converter.converter;


public class WeightConverter {

    public enum Inus {

        KILOGRAMS,
        GRAMS,
        POUNDS,
        OUNCES,
        STONES,
        CARATS,
        MILLIGRAMS,
        MICROGRAMS;

        public static Inus fromString(String text) {
            if (text != null) {
                for (Inus unit : Inus.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double WeightConvert(Inus from,Inus to,double input){
        double ret = 0;
        switch (from)
        {
            case KILOGRAMS:
                if (to == Inus.GRAMS){
                    ret = (input*1000);
                }else if (to == Inus.POUNDS){
                    ret = (input/0.45359237);
                }else if (to == Inus.OUNCES){
                    ret = (input/0.02834952);
                }else if (to == Inus.STONES){
                    ret = (input*0.15747);
                }else if (to == Inus.CARATS){
                    ret = (input*5000.0);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input*1000000);
                }else if (to == Inus.MICROGRAMS){
                    ret = (input*1000000000);
                }
                break;
            case GRAMS:
                if (to == Inus.KILOGRAMS){
                    ret = (input/1000);
                }else if (to == Inus.POUNDS){
                    ret = (input/0.45359237);
                }else if (to == Inus.OUNCES){
                    ret = (input/28.34952);
                }else if (to == Inus.STONES){
                    ret = (input*0.00015747);
                }else if (to == Inus.CARATS){
                    ret = (input*5.0000);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input*1000);
                }else if (to == Inus.MICROGRAMS){
                    ret = (input*1000000);
                }
                break;
            case POUNDS:
                if (to == Inus.GRAMS){
                    ret = (input*453.59237);
                }else if (to == Inus.KILOGRAMS){
                    ret = (input*0.45359237);
                }else if (to == Inus.OUNCES){
                    ret = (input*16);
                }else if (to == Inus.STONES){
                    ret = (input/14);
                }else if (to == Inus.CARATS){
                    ret = (input*2267.96185);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input*453592.37);
                }else if (to == Inus.MICROGRAMS){
                    ret = (input*453592370);
                }
                break;
            case OUNCES:
                if (to == Inus.GRAMS){
                    ret = (input*28.34952);
                }else if (to == Inus.KILOGRAMS){
                    ret = (input*0.02834952);
                }else if (to == Inus.POUNDS){
                    ret = (input/16);
                }else if (to == Inus.STONES){
                    ret = (input/224);
                }else if (to == Inus.CARATS){
                    ret = (input*141.75);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input*28349.5231);
                }else if (to == Inus.MICROGRAMS){
                    ret = (input*28349523.1);
                }
                break;
            case STONES:
                if (to == Inus.GRAMS){
                    ret = (input/0.00015747);
                }else if (to == Inus.KILOGRAMS){
                    ret = (input/0.15747);
                }else if (to == Inus.POUNDS){
                    ret = (input/14);
                }else if (to == Inus.OUNCES){
                    ret = (input*224.00);
                }else if (to == Inus.CARATS){
                    ret = (input*31751);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input*6350293.2);
                }else if (to == Inus.MICROGRAMS){
                    ret = (input*635029318.0);
                }
                break;
            case CARATS:
                if (to == Inus.GRAMS){
                    ret = (input/5.0000);
                }else if (to == Inus.KILOGRAMS){
                    ret = (input/5000.0);
                }else if (to == Inus.POUNDS){
                    ret = (input*0.00044092);
                }else if (to == Inus.OUNCES){
                    ret = (input*0.0070548);
                }else if (to == Inus.STONES){
                    ret = (input*3.1494608e-05);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input/0.0050000);
                }else if (to == Inus.MICROGRAMS){
                    ret = (input*200000);
                }
                break;
            case MILLIGRAMS:
                if (to == Inus.GRAMS){
                    ret = (input/1000);
                }else if (to == Inus.KILOGRAMS){
                    ret = (input/1000000);
                }else if (to == Inus.POUNDS){
                    ret = (input/453592.37);
                }else if (to == Inus.OUNCES){
                    ret = (input/28349.5231);
                }else if (to == Inus.STONES){
                    ret = (input/6350293.18);
                }else if (to == Inus.CARATS){
                    ret = (input/0.0050000);
                }else if (to == Inus.MICROGRAMS){
                    ret = (1000*input);
                }
                break;
            case MICROGRAMS:
                if (to == Inus.GRAMS){
                    ret = (input/1000000);
                }else if (to == Inus.KILOGRAMS){
                    ret = (input/1000000000);
                }else if (to == Inus.POUNDS){
                    ret = (input/453592370);
                }else if (to == Inus.OUNCES){
                    ret = (input/28349523.1);
                }else if (to == Inus.STONES){
                    ret = (input/635029318.0);
                }else if (to == Inus.CARATS){
                    ret = (input/200000);
                }else if (to == Inus.MILLIGRAMS){
                    ret = (input/1000.0);
                }
                break;
        }
        return ret;
    }

}

