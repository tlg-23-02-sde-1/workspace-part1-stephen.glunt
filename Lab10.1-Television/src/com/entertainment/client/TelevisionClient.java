package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

/*
 * Application "main-class" (class with a main() class).
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {

    public static void main(String[] args) {

        Television tv1 = null;
        Television tv2 = null;
        Television tv3 = null;
        try {
            tv1 = new Television("LG", 2000);
            //tv1.setBrand("Panasonic");
            //tv1.setVolume(2000);

            tv2 = new Television("RCA", 10, DisplayType.OLED);
            tv3 = new Television("Sony");
        } catch (InvalidBrandException e) {
            e.printStackTrace();
        }

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        tv2.setVolume(5);
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        tv3.setDisplay(DisplayType.CRT);
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances");
    }
}