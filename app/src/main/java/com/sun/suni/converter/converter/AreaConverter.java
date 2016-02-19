package com.sun.suni.converter.converter;


public class AreaConverter {

    public enum Area {

        HECTARES,
        SQUAREMETERS,
        ACRES,
        SQUAREFEET,
        SQUAREKILOMETERS,
        SQUAREMILES,
        SQUAREYARDS;

        public static Area fromString(String text) {
            if (text != null) {
                for (Area unit : Area.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    public double AreaConvert(Area from, Area to, double input) {

        double ret = 0;

        switch (from) {

            case HECTARES:
                if (to == Area.SQUAREMETERS) {
                    ret = (input/0.00010000);
                } else if (to == Area.ACRES) {
                    ret = (input*2.4711);
                } else if (to == Area.SQUAREFEET) {
                    ret = (input*107640);
                } else if (to == Area.SQUAREKILOMETERS) {
                    ret = (input/100.00);
                } else if (to == Area.SQUAREMILES) {
                    ret = (input*0.0038610);
                } else if (to == Area.SQUAREYARDS) {
                    ret = (input*11960);
                }
                break;
            case SQUAREMETERS:
                if (to == Area.HECTARES) {
                    ret = (input/10000);
                } else if (to == Area.ACRES) {
                    ret = (input*0.00024711);
                } else if (to == Area.SQUAREFEET) {
                    ret = (input*10.764);
                } else if (to == Area.SQUAREKILOMETERS) {
                    ret = (input/1000000);
                } else if (to == Area.SQUAREMILES) {
                    ret = (input*3.8610216e-07);
                } else if (to == Area.SQUAREYARDS) {
                    ret = (input*1.1960);
                }
                break;
            case ACRES:
                if (to == Area.HECTARES) {
                    ret = (input/2.4711);
                } else if (to == Area.SQUAREMETERS) {
                    ret = (input/0.00024711);
                } else if (to == Area.SQUAREFEET) {
                    ret = (input*43560);
                } else if (to == Area.SQUAREKILOMETERS) {
                    ret = (input/247.11);
                } else if (to == Area.SQUAREMILES) {
                    ret = (input*0.0015625);
                } else if (to == Area.SQUAREYARDS) {
                    ret = (input*4840.0);
                }
                break;
            case SQUAREFEET:
                if (to == Area.HECTARES) {
                    ret = (input/107640);
                } else if (to == Area.SQUAREMETERS) {
                    ret = (input/10.764);
                } else if (to == Area.ACRES) {
                    ret = (input*2.29568418910972e-05);
                } else if (to == Area.SQUAREKILOMETERS) {
                    ret = (input/10764000);
                } else if (to == Area.SQUAREMILES) {
                    ret = (input*3.58700658032258e-08);
                } else if (to == Area.SQUAREYARDS) {
                    ret = (input*0.11111);
                }
                break;
            case SQUAREKILOMETERS:
                if (to == Area.HECTARES) {
                    ret = (input/0.010000);
                } else if (to == Area.SQUAREMETERS) {
                    ret = (input/1e-06);
                } else if (to == Area.ACRES) {
                    ret = (input*247.11);
                } else if (to == Area.SQUAREFEET) {
                    ret = (input*10764000);
                } else if (to == Area.SQUAREMILES) {
                    ret = (input*0.38610);
                } else if (to == Area.SQUAREYARDS) {
                    ret = (input*1196000);
                }
                break;
            case SQUAREMILES:
                if (to == Area.HECTARES) {
                    ret = (input/0.0038610);
                } else if (to == Area.SQUAREMETERS) {
                    ret = (input/3.8610216e-07);
                } else if (to == Area.ACRES) {
                    ret = (input*640.00);
                } else if (to == Area.SQUAREKILOMETERS) {
                    ret = (input/0.38610);
                } else if (to == Area.SQUAREFEET) {
                    ret = (input*27878000);
                } else if (to == Area.SQUAREYARDS) {
                    ret = (input*3097600);
                }
                break;
            case SQUAREYARDS:
                if (to == Area.HECTARES) {
                    ret = (input/11960);
                } else if (to == Area.SQUAREMETERS) {
                    ret = (input/1.1960);
                } else if (to == Area.ACRES) {
                    ret = (input*0.00020661);
                } else if (to == Area.SQUAREKILOMETERS) {
                    ret = (input/1196000);
                } else if (to == Area.SQUAREMILES) {
                    ret = (input*3.22830592229032e-07);
                } else if (to == Area.SQUAREFEET) {
                    ret = (input*9.0000);
                }
                break;
        }
        return ret;
    }

}
