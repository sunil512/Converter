package com.sun.suni.converter.converter;


public class TemperatureConverter {

    public enum Units {

        CELSIUS,
        FAHRENHEIT,
        KELVIN,
        RANKINE,
        NEWTON,
        REAUMUR,
        ROMER,
        DELISLE;


        public static Units fromString(String text) {
            if (text != null) {
                for (Units unit : Units.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }


    public double TemperatureConvert(Units from, Units to, double input) {

        double ret = 0;

        switch (from) {

            case CELSIUS:
                if (to == Units.FAHRENHEIT) {
                     ret = (input*9/5)+32;
                }else if (to == Units.KELVIN){
                     ret = (input+273.15);
                }else if (to == Units.RANKINE){
                    ret = (input+273.15)*9/5;
                }else if (to == Units.NEWTON){
                    ret = (input*0.33000);
                }else if (to == Units.REAUMUR){
                    ret = (input*0.80000);
                }else if (to == Units.ROMER){
                    ret = (input*21/40)+7.5;
                }else if (to == Units.DELISLE){
                    ret = (100-input)*3/2;
                }
                break;
            case FAHRENHEIT:
                if (to == Units.CELSIUS) {
                    ret = (input-32)*5/9;
                }else if (to == Units.KELVIN){
                    ret = (input+459.67)*5/9;
                }else if (to == Units.RANKINE){
                    ret = (input+459.67);
                }else if (to == Units.NEWTON){
                    ret = (input-32)*11/60;
                }else if (to == Units.REAUMUR){
                    ret = (input-32)*4/9;
                }else if (to == Units.ROMER){
                    ret = (input-32)*7/24+7.5;
                }else if (to == Units.DELISLE){
                    ret = (212-input)*5/6;
                }
                break;
            case KELVIN:
                if (to == Units.CELSIUS) {
                    ret = (input-273.15);
                }else if (to == Units.FAHRENHEIT){
                    ret = (input*9/5)-459.67;
                }else if (to == Units.RANKINE){
                    ret = (input*9/5);
                }else if (to == Units.NEWTON){
                    ret = (input-273.15)*33/100;
                }else if (to == Units.REAUMUR){
                    ret = (input-273.15)*4/5;
                }else if (to == Units.ROMER){
                    ret = (input-273.15)*21/40+7.5;
                }else if (to == Units.DELISLE){
                    ret = (373.15-input)*3/2;
                }
                break;
            case RANKINE:
                if (to == Units.CELSIUS) {
                    ret = (input-491.67)*5/9;
                }else if (to == Units.FAHRENHEIT){
                    ret = (input-459.67);
                }else if (to == Units.KELVIN){
                    ret = (input*5/9);
                }else if (to == Units.NEWTON){
                    ret = (input-491.67)*11/60;
                }else if (to == Units.REAUMUR){
                    ret = (input-491.67)*4/9;
                }else if (to == Units.ROMER){
                    ret = (input-491.67)*7/24+7.5;
                }else if (to == Units.DELISLE){
                    ret = (671.67-input)*5/6;
                }
                break;
            case NEWTON:
                if (to == Units.CELSIUS) {
                    ret = (input*100/33);
                }else if (to == Units.FAHRENHEIT){
                    ret = (input*60/11+32);
                }else if (to == Units.KELVIN){
                    ret = (input*100/33+273.15);
                }else if (to == Units.RANKINE){
                    ret = (input*60/11+491.67);
                }else if (to == Units.REAUMUR){
                    ret = (input*80/33);
                }else if (to == Units.ROMER){
                    ret = (input*35/22+7.5);
                }else if (to == Units.DELISLE){
                    ret = (33-input)*50/11;
                }
                break;
            case REAUMUR:
                if (to == Units.CELSIUS) {
                    ret = (input*5/4);
                }else if (to == Units.FAHRENHEIT){
                    ret = (input*9/4+32);
                }else if (to == Units.KELVIN){
                    ret = (input*5/4+273.15);
                }else if (to == Units.RANKINE){
                    ret = (input*9/4+491.67);
                }else if (to == Units.NEWTON){
                    ret = (input*33/80);
                }else if (to == Units.ROMER){
                    ret = (input*21/32+7.5);
                }else if (to == Units.DELISLE){
                    ret = (80-input)*15/8;
                }
                break;
            case ROMER:
                if (to == Units.CELSIUS) {
                    ret = (input-7.5)*40/21;
                }else if (to == Units.FAHRENHEIT){
                    ret = (input-7.5)*40/21;
                }else if (to == Units.KELVIN){
                    ret = (input-7.5)*40/21;
                }else if (to == Units.RANKINE){
                    ret = (input-7.5)*40/21;
                }else if (to == Units.NEWTON){
                    ret = (input-7.5)*40/21;
                }else if (to == Units.REAUMUR){
                    ret = (input-7.5)*40/21;
                }else if (to == Units.DELISLE){
                    ret = (input-7.5)*40/21;
                }
                break;
            case DELISLE:
                if (to == Units.CELSIUS) {
                    ret = 100-input*2/3;
                }else if (to == Units.FAHRENHEIT){
                    ret = 212-input*6/5;
                }else if (to == Units.KELVIN){
                    ret = 373.15-input*2/3;
                }else if (to == Units.RANKINE){
                    ret = 671.67-input*6/5;
                }else if (to == Units.NEWTON){
                    ret = 33-input*11/50;
                }else if (to == Units.REAUMUR){
                    ret = 80-input*8/15;
                }else if (to == Units.ROMER){
                    ret = 60-input*7/20;
                }
                break;

        }

        return ret;
    }
}



