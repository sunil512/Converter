package com.sun.suni.converter.converter;


public class CurrentConverter {

    public enum Curr{

        AMPERE,
        KILOAMPERE,
        MILLIAMPERE,
        BIOT,
        ABAMPERE,
        EMUCURRENT,
        STATAMPERE,
        ESUCURRENT,
        ELECTROMAGNETICCGSCURRENT,
        ELECTROSTATICCGSCURRENT;

        public static Curr fromString(String text) {
            if (text != null) {
                for (Curr unit : Curr.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double CurrentConvert(Curr from,Curr to,double in)
    {
        double feet = 1;
        switch (from)
        {
            case AMPERE:
                if(to == Curr.KILOAMPERE){
                    feet = in*0.001;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*1000;
                }else if (to == Curr.BIOT){
                    feet = in*0.1;
                }else if (to == Curr.ABAMPERE){
                    feet = in*0.1;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*0.1;
                }else if (to == Curr.STATAMPERE){
                    feet = in*2997924536.8;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*2997924536.8431;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*0.1;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*2997924536.8 ;
                }
                break;
            case KILOAMPERE:
                if(to == Curr.AMPERE){
                    feet = in*1000;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*1000000;
                }else if (to == Curr.BIOT){
                    feet = in*100;
                }else if (to == Curr.ABAMPERE){
                    feet = in*100;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*100;
                }else if (to == Curr.STATAMPERE){
                    feet = in*2997924536800.00;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*2.997924537e+12;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*100;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in* 2997924536800.00;
                }
                break;
            case MILLIAMPERE:
                if(to == Curr.AMPERE){
                    feet = in*0.001;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*0.000001;
                }else if (to == Curr.BIOT){
                    feet = in*0.0001;
                }else if (to == Curr.ABAMPERE){
                    feet = in*0.0001;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*0.0001;
                }else if (to == Curr.STATAMPERE){
                    feet = in*2997924.5368;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*0.001;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*0.0001;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*2997924.5368;
                }
                break;
            case BIOT:
                if(to == Curr.AMPERE){
                    feet = in*10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*0.01;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*10000;
                }else if (to == Curr.ABAMPERE){
                    feet = in*1;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*1;
                }else if (to == Curr.STATAMPERE){
                    feet = in*29979245368.0;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*2.997924537e+10;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*1;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*29979245368.00;
                }
                break;
            case ABAMPERE:
                if(to == Curr.AMPERE){
                    feet = in*10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*0.01;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*10000;
                }else if (to == Curr.BIOT){
                    feet = in*1;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*1;
                }else if (to == Curr.STATAMPERE){
                    feet = in*29979245368.00 ;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*299792453684.00;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*1;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*29979245368.00;
                }
                break;
            case EMUCURRENT:
                if(to == Curr.AMPERE){
                    feet = in*10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*0.01;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*10000;
                }else if (to == Curr.BIOT){
                    feet = in*1;
                }else if (to == Curr.ABAMPERE){
                    feet = in*1;
                }else if (to == Curr.STATAMPERE){
                    feet = in*299792453684.00;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*2.99792458e+10;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*1;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*29979245368.43;
                }
                break;
            case STATAMPERE:
                if(to == Curr.AMPERE){
                    feet = in*3.335641e-10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*3.335641e-13;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*3.335641e-7;
                }else if (to == Curr.BIOT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.ABAMPERE){
                    feet = in*3.335641e-11;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*1;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*1;
                }
                break;
            case ESUCURRENT:
                if(to == Curr.AMPERE){
                    feet = in*3.335641e-10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*3.335641e-13;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*3.335641e-7;
                }else if (to == Curr.BIOT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.ABAMPERE){
                    feet = in*3.335641e-11;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.STATAMPERE){
                    feet = in*1;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*1;
                }
                break;
            case ELECTROMAGNETICCGSCURRENT:
                if(to == Curr.AMPERE){
                    feet = in*10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*0.01;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*10000;
                }else if (to == Curr.BIOT){
                    feet = in*1;
                }else if (to == Curr.ABAMPERE){
                    feet = in*1;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*1;
                }else if (to == Curr.STATAMPERE){
                    feet = in*29979245368.43;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*29979245368.43;
                }else if (to == Curr.ELECTROSTATICCGSCURRENT){
                    feet = in*29979245368.43;
                }
                break;
            case ELECTROSTATICCGSCURRENT:
                if(to == Curr.AMPERE){
                    feet = in*3.335641e-10;
                }else if (to == Curr.KILOAMPERE){
                    feet = in*3.335641e-13;
                }else if (to == Curr.MILLIAMPERE){
                    feet = in*3.335641e-7;
                }else if (to == Curr.BIOT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.ABAMPERE){
                    feet = in*3.335641e-11;
                }else if (to == Curr.EMUCURRENT){
                    feet = in*3.335641e-11;
                }else if (to == Curr.STATAMPERE){
                    feet = in*1;
                }else if (to == Curr.ESUCURRENT){
                    feet = in*1;
                }else if (to == Curr.ELECTROMAGNETICCGSCURRENT){
                    feet = in*3.335641e-11;
                }
                break;
        }
        return feet;
    }
}
