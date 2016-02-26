package com.sun.suni.converter.converter;


public class VolumeConverter {

    public enum Vol{

        LITERS,
        CENTILITERS,
        MILLILITERS,
        CUBICMETERS,
        CUBICYARDS,
        CUBICFEET,
        CUBICINCHES,
        CUBICCENTIMETERS,
        CUBICMILLIMETERS,
        KILOLITERS,
        BARRELS,
        TABLESPOONS,
        TEASPOONS,
        QUARTS,
        OUNCES;

        public static Vol fromString(String text) {
            if (text != null) {
                for (Vol unit : Vol.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }

    }

    public double VolConvert(Vol from,Vol to,double ipt)
    {
        double ret = 0;
        switch (from)
        {
            case LITERS:
                if (to == Vol.CENTILITERS)
                {
                    ret = ipt/0.010000;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/0.0010000;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/1000.0;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*0.0013080;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.035315;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*61.024;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/0.0010000;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/1e-06;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/1000.0;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*0.0083864;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*67.628;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*202.88;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*1.0567;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*33.814;
                }
                break;
            case CENTILITERS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/100.00;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/0.10000;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/100000;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.3079506e-05;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.00035315;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*0.61024;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/0.10000;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/0.00010000;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/100000;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*8.3864144e-05;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*0.67628;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*2.0288;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.010567;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*0.33814;
                }
                break;
            case MILLILITERS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/1000.0;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/10.000;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/1000000;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.3079506e-06;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*3.5314667e-05;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*0.061024;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/0.0010000;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/1000000;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*8.3864144e-06;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*0.067628;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*0.20288;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.0010567;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*0.033814;
                }
                break;
            case CUBICMETERS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/0.0010000;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/1e-05;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/1e-06;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.3080;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*35.315;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*61024;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/1e-06;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/1e-09;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*8.3864;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*67628;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*202880;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*1056.7;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*33814;
                }
                break;
            case CUBICYARDS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/0.0013080;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/1.3079506e-05;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/1.3079506e-06;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/1.3080;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*27.000;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*46656;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/1.3079506e-06;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/1.3079506e-09;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/1.3080;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*6.4119;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*51705;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*155120;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*807.90;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*25852.7;
                }
                break;
            case CUBICFEET:
                if (to == Vol.LITERS)
                {
                    ret = ipt/0.035315;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/0.00035315;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/3.5314667e-05;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/35.315;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt* 0.037037;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*1728.0;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/3.5314667e-05;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/3.5314667e-08;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/35.315;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*0.23748;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*1915.0;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*5745.0;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*29.922;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*957.506;
                }
                break;
            case CUBICINCHES:
                if (to == Vol.LITERS)
                {
                    ret = ipt/61.024;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/0.61024;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/0.061024;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/61024;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*2.14334702243114e-05;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.00057870;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/0.061024;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/6.1023744e-05;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/61024;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*0.00013965;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*1.1082;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*3.3247;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.017316;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*0.554113;
                }
                break;
            case CUBICCENTIMETERS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/1000.0;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/10.000;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/1000000;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.3079506e-06;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*3.5314667e-05;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*0.061024;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/0.0010000;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/1000000;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*8.3864144e-06;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*0.067628;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*0.20288;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.0010567;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*0.033814;
                }
                break;
            case CUBICMILLIMETERS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/1000000;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/10000;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/1000.0;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/1000000000;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.3079506e-09;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*3.5314667e-08;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*6.1023744e-05;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/1000.0;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/1000000000;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*8.3864144e-09;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*6.7628045e-05;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*0.00020288;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*1.0566882e-06;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*3.3814023e-05;
                }
                break;
            case KILOLITERS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/0.0010000;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/1e-05;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/1e-06;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.3080;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*35.315;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*61024;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/1e-06;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/1e-09;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*8.3864;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*67628;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*202880;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*1056.7;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*33814;
                }
                break;
            case BARRELS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/0.0083864;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/8.3864144e-05;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/8.3864144e-06;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/8.3864;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*0.15596;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*4.2109;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*7276.5;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/8.3864144e-06;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/8.3864144e-09;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/8.3864;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*8064.0;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*24192;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*126.00;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*4032.0;
                }
                break;
            case TABLESPOONS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/67.628;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/0.67628;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/0.067628;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/67628;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*1.93403579831415e-05;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.00052219;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*0.90234;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/0.067628;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/6.7628045e-05;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/67628;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*0.00012401;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*3.0000;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.015625;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*0.5;
                }
                break;
            case TEASPOONS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/202.88;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/2.0288;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/0.20288;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/202880;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*6.44678583550198e-06;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.00017406;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*0.30078;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/0.20288;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/0.00020288;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/202880;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*4.13359782583301e-05;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt*0.33333;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.0052083;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*0.166667;
                }
                break;
            case QUARTS:
                if (to == Vol.LITERS)
                {
                    ret = ipt/1.0567;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/0.010567;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/0.0010567;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/1056.7;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*0.0012378;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.033420;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*57.750;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/0.0010567;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/1.0566882e-06;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/1056.7;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*0.0079365;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt* 64.000;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*192.00;
                }else if (to == Vol.OUNCES)
                {
                    ret = ipt*32;
                }
                break;
            case OUNCES:
                if (to == Vol.LITERS)
                {
                    ret = ipt/0.0295735;
                }else if (to == Vol.CENTILITERS)
                {
                    ret = ipt/2.95735;
                }else if (to == Vol.MILLILITERS)
                {
                    ret = ipt/29.5735;
                }else if (to == Vol.CUBICMETERS)
                {
                    ret = ipt/2.95735e-5;
                }else if (to == Vol.CUBICYARDS)
                {
                    ret = ipt*3.86807e-5;
                }else if (to == Vol.CUBICFEET)
                {
                    ret = ipt*0.00104438;
                }else if (to == Vol.CUBICINCHES)
                {
                    ret = ipt*1.80469;
                }else if (to == Vol.CUBICCENTIMETERS)
                {
                    ret = ipt/29.5735;
                }else if (to == Vol.CUBICMILLIMETERS)
                {
                    ret = ipt/29573.5;
                }else if (to == Vol.KILOLITERS)
                {
                    ret = ipt/2.95735e-5;
                }else if (to == Vol.BARRELS)
                {
                    ret = ipt*0.00024802;
                }else if (to == Vol.TABLESPOONS)
                {
                    ret = ipt* 2;
                }else if (to == Vol.TEASPOONS)
                {
                    ret = ipt*6;
                }else if (to == Vol.QUARTS)
                {
                    ret = ipt*0.03125;
                }
                break;
        }
        return ret;
    }
}
