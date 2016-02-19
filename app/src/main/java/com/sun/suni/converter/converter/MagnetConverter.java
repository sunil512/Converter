package com.sun.suni.converter.converter;


public class MagnetConverter {

    public enum Magg{

        GAUSSSQUARECENTIMETER,
        KILOLINE,
        LINE,
        MAXWELL,
        MAXWELLINTERNATIONAL,
        MEGALINE,
        MICROWEBER,
        MILLIWEBER,
        TESLASQUARECENTIMETER,
        TESLASQUAREMETER,
        VOLTSECOND,
        WEBER;

        public static Magg fromString(String text) {
            if (text != null) {
                for (Magg unit : Magg.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double MagnetConvert(Magg from,Magg to,double inpp)
    {
        double res = 1;
        switch (from)
        {
            case GAUSSSQUARECENTIMETER:
                if (to == Magg.KILOLINE){
                    res = inpp*0.001;
                }else if (to == Magg.LINE){
                    res = inpp*1;
                }else if (to == Magg.MAXWELL){
                    res = inpp*1;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*0.99966911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.000001;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*0.01;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.00001;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*0.0001;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*1e-8;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*1e-8;
                }else if (to == Magg.WEBER){
                    res = inpp*1e-8;
                }
                break;
            case KILOLINE:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*1000;
                }else if (to == Magg.LINE){
                    res = inpp*1000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*1000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*999.66911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.001;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*10;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.01;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*0.1;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*0.00001;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*0.00001;
                }else if (to == Magg.WEBER){
                    res = inpp*0.00001;
                }
                break;
            case LINE:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*1;
                }else if (to == Magg.KILOLINE){
                    res = inpp*0.001;
                }else if (to == Magg.MAXWELL){
                    res = inpp*1;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*0.99966911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.000001;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*0.01;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.00001;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*0.0001;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*1e-8;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*1e-8;
                }else if (to == Magg.WEBER){
                    res = inpp*1e-8;
                }
                break;
            case MAXWELL:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*1;
                }else if (to == Magg.KILOLINE){
                    res = inpp*0.001;
                }else if (to == Magg.LINE){
                    res = inpp*1;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*0.99966911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.000001;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*0.01;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.00001;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*0.001;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*0.0001;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*0.1e-8;
                }else if (to == Magg.WEBER){
                    res = inpp*1e-8;
                }
                break;
            case MAXWELLINTERNATIONAL:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*1.0003310;
                }else if (to == Magg.KILOLINE){
                    res = inpp*0.0010003310;
                }else if (to == Magg.LINE){
                    res = inpp*1.0003310;
                }else if (to == Magg.MAXWELL){
                    res = inpp*1.0003310;
                }else if (to == Magg.MEGALINE){
                    res = inpp*1;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*0.001;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.001;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*0.00010003310;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*1.0003310e-8;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*1.0003310e-8;
                }else if (to == Magg.WEBER){
                    res = inpp*1.0003310e-8;
                }
                break;
            case MEGALINE:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*1000000;
                }else if (to == Magg.KILOLINE){
                    res = inpp*1000;
                }else if (to == Magg.LINE){
                    res = inpp*1000000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*1000000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*999669.11;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*10000;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*10;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*100;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*0.01;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*0.01;
                }else if (to == Magg.WEBER){
                    res = inpp*0.01;
                }
                break;
            case MICROWEBER:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*100;
                }else if (to == Magg.KILOLINE){
                    res = inpp*0.1;
                }else if (to == Magg.LINE){
                    res = inpp*100;
                }else if (to == Magg.MAXWELL){
                    res = inpp*100;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*0.001;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.0001;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.001;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*0.01;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*0.000001;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*0.000001;
                }else if (to == Magg.WEBER){
                    res = inpp*0.000001;
                }
                break;
            case MILLIWEBER:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*100000;
                }else if (to == Magg.KILOLINE){
                    res = inpp*100;
                }else if (to == Magg.LINE){
                    res = inpp*100000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*100000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*0.001;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.1;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*1000;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*10;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*0.001;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*0.001;
                }else if (to == Magg.WEBER){
                    res = inpp*0.001;
                }
                break;
            case TESLASQUARECENTIMETER:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*10000;
                }else if (to == Magg.KILOLINE){
                    res = inpp*10;
                }else if (to == Magg.LINE){
                    res = inpp*10000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*10000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*9996.6911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*0.01;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*100;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*0.1;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*0.0001;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*0.0001;
                }else if (to == Magg.WEBER){
                    res = inpp*0.0001;
                }
                break;
            case TESLASQUAREMETER:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*100000000;
                }else if (to == Magg.KILOLINE){
                    res = inpp*100000;
                }else if (to == Magg.LINE){
                    res = inpp*100000000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*100000000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*99966911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*100;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*1000000;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*1000;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*10000;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*1;
                }else if (to == Magg.WEBER){
                    res = inpp*1;
                }
                break;
            case VOLTSECOND:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*100000000;
                }else if (to == Magg.KILOLINE){
                    res = inpp*100000;
                }else if (to == Magg.LINE){
                    res = inpp*100000000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*100000000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*99966911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*100;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*1000000;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*1000;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*10000;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*1;
                }else if (to == Magg.WEBER){
                    res = inpp*1;
                }
                break;
            case WEBER:
                if (to == Magg.GAUSSSQUARECENTIMETER){
                    res = inpp*100000000;
                }else if (to == Magg.KILOLINE){
                    res = inpp*100000;
                }else if (to == Magg.LINE){
                    res = inpp*100000000;
                }else if (to == Magg.MAXWELL){
                    res = inpp*100000000;
                }else if (to == Magg.MAXWELLINTERNATIONAL){
                    res = inpp*99966911;
                }else if (to == Magg.MEGALINE){
                    res = inpp*100;
                }else if (to == Magg.MICROWEBER){
                    res = inpp*1000000;
                }else if (to == Magg.MILLIWEBER){
                    res = inpp*1000;
                }else if (to == Magg.TESLASQUARECENTIMETER){
                    res = inpp*10000;
                }else if (to == Magg.TESLASQUAREMETER){
                    res = inpp*1;
                }else if (to == Magg.VOLTSECOND){
                    res = inpp*1;
                }
                break;
        }
        return res;
    }
}
