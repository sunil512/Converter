package com.sun.suni.converter.converter;


public class PressureConverter {

    public enum Press{

        ATMOSPHERE,
        BAR,
        HECTOPASCAL,
        KGPERSQUARECM,
        KGPERSQUAREMETER,
        KILOPASCAL,
        MILLIBAR,
        MILLILETEROFMERCURY,
        PASCAL,
        POUNDSPERSQUAREFOOT,
        POUNDSPERSQUAREINCH,
        TORR;

        public static Press fromString(String text) {
            if (text != null) {
                for (Press unit : Press.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double PressureConvert(Press from,Press to,double ipu)
    {
        double reep = 1;
        switch (from)
        {
            case ATMOSPHERE:
                if (to == Press.BAR){
                    reep = ipu*1.01325;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*1013.25;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*1.0332274528;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*10332.274528;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*101.325;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*1013.25;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*760;
                }else if (to == Press.PASCAL){
                    reep = ipu*101325;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2116.218862178;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*14.69596432068;
                }else if (to == Press.TORR){
                    reep = ipu*760;
                }
                break;
            case BAR:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.986923266716;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*1000;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*1.019716212978;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*10197.16212978;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*100;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*1000;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*750.0616827042;
                }else if (to == Press.PASCAL){
                    reep = ipu*100000;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2088.545632547;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*14.50378911491;
                }else if (to == Press.TORR){
                    reep = ipu*750.0616827042;
                }
                break;
            case HECTOPASCAL:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.000986923266716;
                }else if (to == Press.BAR){
                    reep = ipu*0.001;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.001019716212978;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*10.19716212978;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.1;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*1;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*0.7500616827042;
                }else if (to == Press.PASCAL){
                    reep = ipu*100;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2.088545632547;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.01450378911491;
                }else if (to == Press.TORR){
                    reep = ipu*0.7500616827042;
                }
                break;
            case KGPERSQUARECM:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.9678411053541;
                }else if (to == Press.BAR){
                    reep = ipu*0.980665;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*980.665;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*10000;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*98.0665;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*980.665;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*735.5592400691;
                }else if (to == Press.PASCAL){
                    reep = ipu*98066.5;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2048.163602741;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*14.22335835237;
                }else if (to == Press.TORR){
                    reep = ipu*735.5592400691;
                }
                break;
            case KGPERSQUAREMETER:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.00009678411053541;
                }else if (to == Press.BAR){
                    reep = ipu*0.0000980665;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*0.0980665;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.0001;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.00980665;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*0.0980665;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*0.07355592400691;
                }else if (to == Press.PASCAL){
                    reep = ipu*9.80665;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*0.2048163602741;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.001422335835237;
                }else if (to == Press.TORR){
                    reep = ipu*0.07355592400691;
                }
                break;
            case KILOPASCAL:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.00986923266716;
                }else if (to == Press.BAR){
                    reep = ipu*0.01;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*10;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.001019716212978;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*10.19716212978;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*10;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*7.500616827042;
                }else if (to == Press.PASCAL){
                    reep = ipu*1000;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*20.88545632547;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.1450378911491;
                }else if (to == Press.TORR){
                    reep = ipu*7.500616827042;
                }
                break;
            case MILLIBAR:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.000986923266716;
                }else if (to == Press.BAR){
                    reep = ipu*0.001;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*1;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.001019716212978;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*10.19716212978;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.1;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*0.7500616827042;
                }else if (to == Press.PASCAL){
                    reep = ipu*100;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2.088545632547;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.01450378911491;
                }else if (to == Press.TORR){
                    reep = ipu*0.7500616827042;
                }
                break;
            case MILLILETEROFMERCURY:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.001315789473684;
                }else if (to == Press.BAR){
                    reep = ipu*0.001333223684211;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*1.333223684211;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.001359509806316;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*13.59509806316;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.1333223684211;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*1.333223684211;
                }else if (to == Press.PASCAL){
                    reep = ipu*133.3223684211;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2.784498502865;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.01933679515879;
                }else if (to == Press.TORR){
                    reep = ipu*1;
                }
                break;
            case PASCAL:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.00000986923266716;
                }else if (to == Press.BAR){
                    reep = ipu*0.00001;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*0.01;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.00001019716212978;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*0.1019716212978;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.001;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*0.01;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*0.007500616827042;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*0.02088545632547;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.0001450378911491;
                }else if (to == Press.TORR){
                    reep = ipu*0.007500616827042;
                }
                break;
            case POUNDSPERSQUAREFOOT:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.0004725409161938;
                }else if (to == Press.BAR){
                    reep = ipu*0.0004788020833333;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*0.4788020833333;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.0004882422471826;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*4.882422471826;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.04788020833333;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*0.4788020833333;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*0.3591310963073;
                }else if (to == Press.PASCAL){
                    reep = ipu*47.88020833333;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.006944444444444;
                }else if (to == Press.TORR){
                    reep = ipu*0.3591310963073;
                }
                break;
            case POUNDSPERSQUAREINCH:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.0680458919319;
                }else if (to == Press.BAR){
                    reep = ipu*0.0689475;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*68.9475;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.0703068835943;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*703.068835943;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*6.89475;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*68.9475;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*51.71487786825;
                }else if (to == Press.PASCAL){
                    reep = ipu*6894.75;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*144;
                }else if (to == Press.TORR){
                    reep = ipu*51.71487786825;
                }
                break;
            case TORR:
                if (to == Press.ATMOSPHERE){
                    reep = ipu*0.001315789473684;
                }else if (to == Press.BAR){
                    reep = ipu*0.001333223684211;
                }else if (to == Press.HECTOPASCAL){
                    reep = ipu*1.333223684211;
                }else if (to == Press.KGPERSQUARECM){
                    reep = ipu*0.001359509806316;
                }else if (to == Press.KGPERSQUAREMETER){
                    reep = ipu*13.59509806316;
                }else if (to == Press.KILOPASCAL){
                    reep = ipu*0.1333223684211;
                }else if (to == Press.MILLIBAR){
                    reep = ipu*1.333223684211;
                }else if (to == Press.MILLILETEROFMERCURY){
                    reep = ipu*1;
                }else if (to == Press.PASCAL){
                    reep = ipu*133.3223684211;
                }else if (to == Press.POUNDSPERSQUAREFOOT){
                    reep = ipu*2.784498502865;
                }else if (to == Press.POUNDSPERSQUAREINCH){
                    reep = ipu*0.01933679515879;
                }
                break;

        }
        return reep;
    }
}
