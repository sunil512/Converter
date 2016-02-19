package com.sun.suni.converter.converter;

public class StorageConverter {

   public enum Store{

      BIT,
      BYTE,
      KILOBYTE,
      MEGABYTE,
      GIGABYTE,
      TERABYTE,
      PETABYTE;

      public static Store fromString(String text) {
         if (text != null) {
            for (Store unit : Store.values()) {
               if (text.equalsIgnoreCase(unit.toString())) {
                  return unit;
               }
            }
         }

         throw new IllegalArgumentException("Cannot find a value for " + text);
      }
   }

   public double StorageCon(Store from,Store to,double ipp)
   {
      double rep = 1;
      switch (from)
      {
         case BIT:
            if (to == Store.BYTE){
               rep = ipp*0.125;
            }else if (to == Store.KILOBYTE) {
               rep = ipp*0.0001220703125;
            }else if (to == Store.MEGABYTE) {
               rep = ipp*1.192092895508E-7;
            }else if (to == Store.GIGABYTE) {
               rep = ipp*1.164153218269E-10;
            }else if (to == Store.TERABYTE) {
               rep = ipp*1.136912032962E-13;
            }else if (to == Store.PETABYTE) {
               rep = ipp*2.953157760203E-10;
            }
            break;
         case BYTE:
            if (to == Store.BIT){
               rep = ipp*8;
            }else if (to == Store.KILOBYTE){
               rep = ipp*0.0009765625;
            }else if (to == Store.MEGABYTE) {
               rep = ipp*9.536743164063E-7;
            }else if (to == Store.GIGABYTE) {
               rep = ipp*9.313225746155E-10;
            }else if (to == Store.TERABYTE) {
               rep = ipp*9.095296263695E-13;
            }else if (to == Store.PETABYTE) {
               rep = ipp*2.362526208162E-9;
            }
            break;
         case KILOBYTE:
            if (to == Store.BIT){
               rep = ipp*8192;
            }else if (to == Store.BYTE){
               rep = ipp*1024;
            }else if (to == Store.MEGABYTE) {
               rep = ipp*0.0009765625;
            }else if (to == Store.GIGABYTE) {
               rep = ipp*9.536743164063E-7;
            }else if (to == Store.TERABYTE) {
               rep = ipp*9.313583374023E-10;
            }else if (to == Store.PETABYTE) {
               rep = ipp*0.000002419226837158;
            }
            break;
         case MEGABYTE:
            if (to == Store.BIT){
               rep = ipp*8388608;
            }else if (to == Store.BYTE){
               rep = ipp*1048576;
            }else if (to == Store.KILOBYTE){
               rep = ipp*1024;
            }else if (to == Store.GIGABYTE) {
               rep = ipp*0.0009765625 ;
            }else if (to == Store.TERABYTE) {
               rep = ipp*9.537109375E-7 ;
            }else if (to == Store.PETABYTE) {
               rep = ipp*0.00247728828125 ;
            }
            break;
         case GIGABYTE:
            if (to == Store.BIT){
               rep = ipp*858993459.2;
            }else if (to == Store.BYTE){
               rep = ipp*1073741824;
            }else if (to == Store.KILOBYTE){
               rep = ipp*1048576;
            }else if (to == Store.MEGABYTE) {
               rep = ipp*1024;
            }else if (to == Store.TERABYTE) {
               rep = ipp*0.0009766;
            }else if (to == Store.PETABYTE) {
               rep = ipp*2.5367432;
            }
            break;
         case TERABYTE:
            if (to == Store.BIT){
               rep = ipp*8795755265.206;
            }else if (to == Store.BYTE){
               rep = ipp*1099469408.151;
            }else if (to == Store.KILOBYTE){
               rep = ipp*1073700593.897;
            }else if (to == Store.MEGABYTE) {
               rep = ipp*1048535.736228;
            }else if (to == Store.GIGABYTE) {
               rep = ipp*1023.96067991;
            }else if (to == Store.PETABYTE) {
               rep = ipp*2597.525291829;
            }
            break;
         case PETABYTE:
            if (to == Store.BIT){
               rep = ipp*3386205821.701;
            }else if (to == Store.BYTE){
               rep = ipp*423275727.7126;
            }else if (to == Store.KILOBYTE){
               rep = ipp*413355.2028443;
            }else if (to == Store.MEGABYTE) {
               rep = ipp*403.6671902777;
            }else if (to == Store.GIGABYTE) {
               rep = ipp*0.3942062405055;
            }else if (to == Store.TERABYTE) {
               rep = ipp*0.0003849818144777;
            }
            break;
      }
      return rep;
   }
}
