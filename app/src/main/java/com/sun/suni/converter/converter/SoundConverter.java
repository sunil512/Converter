package com.sun.suni.converter.converter;


public class SoundConverter {

    public enum Sund{

        BEL,
        DECIBEL,
        NEPER;

        public static Sund fromString(String text) {
            if (text != null) {
                for (Sund unit : Sund.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double SoundConvert(Sund from,Sund to,double input)
    {
        double rep = 1;
        switch (from)
        {
            case BEL:
                if (to == Sund.DECIBEL){
                    rep = input*10.00;
                }else if (to == Sund.NEPER){
                    rep = input*1.1513;
                }
                break;
            case DECIBEL:
                if (to == Sund.BEL){
                    rep = input*0.1;
                }else if (to == Sund.NEPER){
                    rep = input*0.11513;
                }
                break;
            case NEPER:
                if (to == Sund.BEL){
                    rep = input*0.868589;
                }else if (to == Sund.DECIBEL){
                    rep = input*8.68589;
                }
                break;
        }
        return rep;
    }
}
