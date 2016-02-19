package com.sun.suni.converter.converter;


public class ImageConverter {

    public enum Img{

        TWIP,
        METER,
        CENTIMETER,
        MILLIMETER,
        CHARACTERX,
        CHARACTERY,
        PIXELX,
        PIXELY,
        INCH,
        PICA,
        POINT,
        EN;

        public static Img fromString(String text) {
            if (text != null) {
                for (Img unit : Img.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double ImageConvert(Img from,Img to,double inpp)
    {
        double rex = 1;
        switch (from)
        {
            case TWIP:
                if (to == Img.METER){
                    rex = inpp*0.00001763888888889;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.001763888888889;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*0.01763888888889;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*0.008333333333333;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.004166666666667;
                }else if (to == Img.PIXELX){
                    rex = inpp*0.06666666666667;
                }else if (to == Img.PIXELY){
                    rex = inpp*0.06666666666667;
                }else if (to == Img.INCH){
                    rex = inpp*0.0006944444444444;
                }else if (to == Img.PICA){
                    rex = inpp*0.004166666666666;
                }else if (to == Img.POINT){
                    rex = inpp*0.04999999999999;
                }else if (to == Img.EN){
                    rex = inpp*0.02509374999999;
                }
                break;
            case METER:
                if (to == Img.TWIP){
                    rex = inpp*56692.9133858;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*99.99999999995;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*999.9999999995;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*472.4409448816;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*236.2204724408;
                }else if (to == Img.PIXELX){
                    rex = inpp*3779.527559053;
                }else if (to == Img.PIXELY){
                    rex = inpp*3779.527559053;
                }else if (to == Img.INCH){
                    rex = inpp*39.37007874013;
                }else if (to == Img.PICA){
                    rex = inpp*236.2204724408;
                }else if (to == Img.POINT){
                    rex = inpp*2834.64566929;
                }else if (to == Img.EN){
                    rex = inpp*1422.637795275;
                }
                break;
            case CENTIMETER:
                if (to == Img.TWIP){
                    rex = inpp*566.929133858;
                }else if (to == Img.METER){
                    rex = inpp*0.009999999999995;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*9.999999999995;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*4.724409448816;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*2.362204724408;
                }else if (to == Img.PIXELX){
                    rex = inpp*37.79527559053;
                }else if (to == Img.PIXELY){
                    rex = inpp*37.79527559053;
                }else if (to == Img.INCH){
                    rex = inpp*0.3937007874013;
                }else if (to == Img.PICA){
                    rex = inpp*2.362204724408;
                }else if (to == Img.POINT){
                    rex = inpp*28.3464566929;
                }else if (to == Img.EN){
                    rex = inpp*14.22637795275;
                }
                break;
            case MILLIMETER:
                if (to == Img.TWIP){
                    rex = inpp*56.6929133858;
                }else if (to == Img.METER){
                    rex = inpp*0.0009999999999995;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.09999999999995;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*0.4724409448816;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.2362204724408;
                }else if (to == Img.PIXELX){
                    rex = inpp*3.779527559053;
                }else if (to == Img.PIXELY){
                    rex = inpp*3.779527559053;
                }else if (to == Img.INCH){
                    rex = inpp*0.03937007874013;
                }else if (to == Img.PICA){
                    rex = inpp*0.2362204724408;
                }else if (to == Img.POINT){
                    rex = inpp*2.83464566929;
                }else if (to == Img.EN){
                    rex = inpp*1.422637795275;
                }
                break;
            case CHARACTERX:
                if (to == Img.TWIP){
                    rex = inpp*120;
                }else if (to == Img.METER){
                    rex = inpp*0.002116666666667;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.2116666666667;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*2.116666666667;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.5;
                }else if (to == Img.PIXELX){
                    rex = inpp*8;
                }else if (to == Img.PIXELY){
                    rex = inpp*8;
                }else if (to == Img.INCH){
                    rex = inpp*0.08333333333333;
                }else if (to == Img.PICA){
                    rex = inpp*0.5;
                }else if (to == Img.POINT){
                    rex = inpp*6;
                }else if (to == Img.EN){
                    rex = inpp*3.01125;
                }
                break;
            case CHARACTERY:
                if (to == Img.TWIP){
                    rex = inpp*240;
                }else if (to == Img.METER){
                    rex = inpp*0.004233333333333;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.4233333333333;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*4.233333333333;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*2;
                }else if (to == Img.PIXELX){
                    rex = inpp*16;
                }else if (to == Img.PIXELY){
                    rex = inpp*16;
                }else if (to == Img.INCH){
                    rex = inpp*0.1666666666667;
                }else if (to == Img.PICA){
                    rex = inpp*1;
                }else if (to == Img.POINT){
                    rex = inpp*12;
                }else if (to == Img.EN){
                    rex = inpp*6.0225;
                }
                break;
            case PIXELX:
                if (to == Img.TWIP){
                    rex = inpp*15;
                }else if (to == Img.METER){
                    rex = inpp*0.0002645833333333;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.02645833333333;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*0.2645833333333;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*0.125;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.0625;
                }else if (to == Img.PIXELY){
                    rex = inpp*1;
                }else if (to == Img.INCH){
                    rex = inpp*0.01041666666667;
                }else if (to == Img.PICA){
                    rex = inpp*0.0625;
                }else if (to == Img.POINT){
                    rex = inpp*0.75;
                }else if (to == Img.EN){
                    rex = inpp*0.37640625;
                }
                break;
            case PIXELY:
                if (to == Img.TWIP){
                    rex = inpp*15;
                }else if (to == Img.METER){
                    rex = inpp*0.0002645833333333;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.02645833333333;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*0.2645833333333;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*0.125;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.0625;
                }else if (to == Img.PIXELX){
                    rex = inpp*1;
                }else if (to == Img.INCH){
                    rex = inpp*0.01041666666667;
                }else if (to == Img.PICA){
                    rex = inpp*0.0625;
                }else if (to == Img.POINT){
                    rex = inpp*0.75;
                }else if (to == Img.EN){
                    rex = inpp*0.37640625;
                }
                break;
            case INCH:
                if (to == Img.TWIP){
                    rex = inpp*1440;
                }else if (to == Img.METER){
                    rex = inpp*0.0254;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*2.54;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*25.4;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*12;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*6;
                }else if (to == Img.PIXELX){
                    rex = inpp*96;
                }else if (to == Img.PIXELY){
                    rex = inpp*96;
                }else if (to == Img.PICA){
                    rex = inpp*6;
                }else if (to == Img.POINT){
                    rex = inpp*72;
                }else if (to == Img.EN){
                    rex = inpp*36.135;
                }
                break;
            case PICA:
                if (to == Img.TWIP){
                    rex = inpp*240;
                }else if (to == Img.METER){
                    rex = inpp*0.004233333333333;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.4233333333333;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*4.233333333333;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*2;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.9999999999999;
                }else if (to == Img.PIXELX){
                    rex = inpp*16;
                }else if (to == Img.PIXELY){
                    rex = inpp*16;
                }else if (to == Img.INCH){
                    rex = inpp*0.1666666666667;
                }else if (to == Img.POINT){
                    rex = inpp*12;
                }else if (to == Img.EN){
                    rex = inpp*6.0225;
                }
                break;
            case POINT:
                if (to == Img.TWIP){
                    rex = inpp*20;
                }else if (to == Img.METER){
                    rex = inpp*0.0003527777777778;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.03527777777778;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*0.3527777777778;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*0.1666666666667;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.08333333333333;
                }else if (to == Img.PIXELX){
                    rex = inpp*1.333333333333;
                }else if (to == Img.PIXELY){
                    rex = inpp*1.333333333333;
                }else if (to == Img.INCH){
                    rex = inpp*0.01388888888888;
                }else if (to == Img.PICA){
                    rex = inpp*0.08333333333328;
                }else if (to == Img.EN){
                    rex = inpp*0.5018749999997;
                }
                break;
            case EN:
                if (to == Img.TWIP){
                    rex = inpp*39.85056039848;
                }else if (to == Img.METER){
                    rex = inpp*0.0007029196070288;
                }else if (to == Img.CENTIMETER){
                    rex = inpp*0.07029196070288;
                }else if (to == Img.MILLIMETER){
                    rex = inpp*0.7029196070288;
                }else if (to == Img.CHARACTERX){
                    rex = inpp*0.3320880033207;
                }else if (to == Img.CHARACTERY){
                    rex = inpp*0.1660440016604;
                }else if (to == Img.PIXELX){
                    rex = inpp*2.656704026567;
                }else if (to == Img.PIXELY){
                    rex = inpp*2.656704026567;
                }else if (to == Img.INCH){
                    rex = inpp*0.02767400027674;
                }else if (to == Img.PICA){
                    rex = inpp*0.1660440016604;
                }else if (to == Img.POINT){
                    rex = inpp*1.992528019925;
                }
                break;
        }
        return rex;
    }
}
