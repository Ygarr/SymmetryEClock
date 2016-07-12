package com.company;

public class Main {

    public static void main(String[] args) {
        int reversemin,reversemin1,reversemin2;
        int count = 1;

       for (int hour=00; hour <=23; hour++) {
           for (int min = 00; min <= 59; min++) {

                   reversemin1 = min / 10;
                   reversemin2 = min % 10;
                   reversemin = reversemin2 * 10 + reversemin1;

               if (hour == reversemin) {
                   System.out.println(hour + " : " + min + " Симметричность №"+ (count++) );
               }
           }
       }


    }
}
