package com.sun.suni.converter.converter;


public class TimeConverter {

    public enum Time{

        SECONDS,
        MINUTES,
        HOUR,
        DAY;

        public static Time fromString(String text) {
            if (text != null) {
                for (Time unit : Time.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double TimeConv(Time from,Time to,double tm)
    {
        double ret = 0;
        switch (from)
        {
            case SECONDS:
                if (to == Time.MINUTES){
                    ret = (tm*0.016667);
                }else if (to == Time.HOUR){
                    ret = (tm*0.00027778);
                }else if (to == Time.DAY){
                    ret = (tm*1.1574074e-05);
                }
                break;
            case MINUTES:
                if (to == Time.SECONDS){
                    ret = (tm/0.016667);
                }else if (to == Time.HOUR){
                    ret = (tm*0.016667);
                }else if (to == Time.DAY){
                    ret = (tm*0.00069444);
                }
                break;
            case HOUR:
                if (to == Time.SECONDS){
                    ret = (tm/0.00027778);
                }else if (to == Time.MINUTES){
                    ret = (tm*60.000);
                }else if (to == Time.DAY){
                    ret = (tm*0.041667);
                }
                break;
            case DAY:
                if (to == Time.SECONDS){
                    ret = (tm/1.1574074e-05);
                }else if (to == Time.MINUTES){
                    ret = (tm*1440.0);
                }else if (to == Time.HOUR){
                    ret = (tm*24.000);
                }
                break;
        }
        return ret;
    }
}
