package com.sun.suni.converter.converter;


public class EnergyConverter {

    public enum Ene{

        BRITISHTHERMALUNIT,
        CALORIES,
        ELECTRONVOLTS,
        ERG,
        FOOTPOUND,
        GIGAJOULE,
        JOULE,
        KILOCALORIES,
        KILOJOULES,
        KILOWATTHOUR,
        NUTRITIONCALORIE,
        TONOFTNT,
        WATTHOUR;

        public static Ene fromString(String text) {
            if (text != null) {
                for (Ene unit : Ene.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double EnergyConvert(Ene from,Ene to,double ig)
    {
        double reet = 1;
        switch (from)
        {
            case BRITISHTHERMALUNIT:
                if (to == Ene.CALORIES){
                    reet = ig*251.9957963122;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*6.585142305005E+21;
                }else if (to == Ene.ERG){
                    reet = ig*1055056000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*778.1693709679;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*0.000001055056;
                }else if (to == Ene.JOULE){
                    reet = ig*1055.056;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*0.2519957963122;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*1.055056;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*0.0002930711111111;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*0.2519957963122;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*2.521644359465E-7;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*0.2930711111111;
                }
                break;
            case CALORIES:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*0.003968320164996;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*2613195299832000000.0;
                }else if (to == Ene.ERG){
                    reet = ig*41868000;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*3.088025206594;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*4.1868E-9;
                }else if (to == Ene.JOULE){
                    reet = ig*4.1868;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*0.001;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*0.0041868;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*0.000001163;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*0.001;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*1.000669216061E-9;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*0.001163;
                }
                break;
            case ELECTRONVOLTS:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*1.518570068319E-22;
                }else if (to == Ene.CALORIES){
                    reet = ig*3.826732736219E-20;
                }else if (to == Ene.ERG){
                    reet = ig*1.602176462E-12;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*1.181704714834E-19;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*1.602176462E-28;
                }else if (to == Ene.JOULE){
                    reet = ig*1.602176462E-19;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*3.826732736219E-23;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*1.602176462E-22;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*4.450490172222E-26;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*3.826732736219E-23;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*3.829293647228E-29;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*4.450490172222E-23;
                }
                break;
            case ERG:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*9.478169879134E-11;
                }else if (to == Ene.CALORIES){
                    reet = ig*2.388458966275E-8;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*624150974451.2;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*7.375621492773E-8;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*1E-16;
                }else if (to == Ene.JOULE){
                    reet = ig*1E-7;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*2.388458966275E-11;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*1E-10;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*2.777777777778E-14;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*2.388458966275E-11;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*2.390057361377E-17;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*2.777777777778E-11;
                }
                break;
            case FOOTPOUND:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*0.001285067283946;
                }else if (to == Ene.CALORIES){
                    reet = ig*0.3238315535329;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*846235093629400000.0;
                }else if (to == Ene.ERG){
                    reet = ig*13558179.48331;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*1.355817948331E-9;
                }else if (to == Ene.JOULE){
                    reet = ig*1.355817948331;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*0.0003238315535329;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*0.001355817948331;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*3.766160967587E-7;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*0.0003238315535329;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*3.240482668096E-10;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*0.0003766160967587;
                }
                break;
            case GIGAJOULE:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*947816.9879134;
                }else if (to == Ene.CALORIES){
                    reet = ig*238845896.6275;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*6.241509744512E+27;
                }else if (to == Ene.ERG){
                    reet = ig*100000000000000.00;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*737562149.2773;
                }else if (to == Ene.JOULE){
                    reet = ig*1000000000;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*238845.8966275;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*1000000;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*277.7777777778;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*238845.8966275;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*0.2390057361377;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*277777.7777778;
                }
                break;
            case JOULE:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*0.0009478169879134;
                }else if (to == Ene.CALORIES){
                    reet = ig*0.2388458966275;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*624150974451200000.0;
                }else if (to == Ene.ERG){
                    reet = ig*10000000;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*0.7375621492773;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*1E-9;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*0.0002388458966275;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*0.001;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*2.777777777778E-7;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*0.0002388458966275;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*2.390057361377E-10;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*0.0002777777777778;
                }
                break;
            case KILOCALORIES:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*3.968320164996;
                }else if (to == Ene.CALORIES){
                    reet = ig*1000;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*2.613195299832E+22;
                }else if (to == Ene.ERG){
                    reet = ig*4186800000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*3088.025206594;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*0.0000041868;
                }else if (to == Ene.JOULE){
                    reet = ig*4186.8;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*4.1868;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*0.001163;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*1;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*0.000001000669216061;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*1.163;
                }
                break;
            case KILOJOULES:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*0.9478169879134;
                }else if (to == Ene.CALORIES){
                    reet = ig*238.8458966275;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*6.241509744512E+21;
                }else if (to == Ene.ERG){
                    reet = ig*1000000000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*737.5621492773;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*0.000001;
                }else if (to == Ene.JOULE){
                    reet = ig*1000;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*0.2388458966275;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*0.0002777777777778;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*0.2388458966275;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*2.390057361377E-7;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*0.2777777777778;
                }
                break;
            case KILOWATTHOUR:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*3412.141156488;
                }else if (to == Ene.CALORIES){
                    reet = ig*859845.227859;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*2.246943508024E+25;
                }else if (to == Ene.ERG){
                    reet = ig*3600000000000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*2655223.737398;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*0.0036;
                }else if (to == Ene.JOULE){
                    reet = ig*3600000;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*859.845227859;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*3600;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*859.845227859;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*0.0008604206500956;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*1000;
                }
                break;
            case NUTRITIONCALORIE:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*3.968320164996;
                }else if (to == Ene.CALORIES){
                    reet = ig*1000;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*2.613195299832E+22;
                }else if (to == Ene.ERG){
                    reet = ig*4186800000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*3088.025206594;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*0.0000041868;
                }else if (to == Ene.JOULE){
                    reet = ig*4186.8;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*1.0;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*4.1868;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*0.001163;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*0.000001000669216061;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*1.163;
                }
                break;
            case TONOFTNT:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*3965666.27743;
                }else if (to == Ene.CALORIES){
                    reet = ig*999331231.4894;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*2.611447677104E+28;
                }else if (to == Ene.ERG){
                    reet = ig*41840000000000000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*3085960032.576;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*4.184;
                }else if (to == Ene.JOULE){
                    reet = ig*4184000000.0;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*999331.2314894;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*4184000;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*1162.222222222;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*999331.2314894;
                }else if (to == Ene.WATTHOUR){
                    reet = ig*1162222.222222;
                }
                break;
            case WATTHOUR:
                if (to == Ene.BRITISHTHERMALUNIT){
                    reet = ig*3.412141156488;
                }else if (to == Ene.CALORIES){
                    reet = ig*859.845227859;
                }else if (to == Ene.ELECTRONVOLTS){
                    reet = ig*2.246943508024E+22;
                }else if (to == Ene.ERG){
                    reet = ig*36000000000.0;
                }else if (to == Ene.FOOTPOUND){
                    reet = ig*2655.223737398;
                }else if (to == Ene.GIGAJOULE){
                    reet = ig*0.0000036;
                }else if (to == Ene.JOULE){
                    reet = ig*3600;
                }else if (to == Ene.KILOCALORIES){
                    reet = ig*0.859845227859;
                }else if (to == Ene.KILOJOULES){
                    reet = ig*3.6;
                }else if (to == Ene.KILOWATTHOUR){
                    reet = ig*0.001;
                }else if (to == Ene.NUTRITIONCALORIE){
                    reet = ig*0.859845227859;
                }else if (to == Ene.TONOFTNT){
                    reet = ig*8.604206500956E-7;
                }
                break;
        }
        return reet;
    }
}
