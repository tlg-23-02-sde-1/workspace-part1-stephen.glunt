package com.entertainment.client;

import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        try {
            tv.setBrand("Samsung");
            System.out.println(tv);

            tv.setBrand("LG");
            System.out.println(tv);

            tv.setBrand("Sony");
            System.out.println(tv);

            tv.setBrand("Toshiba");
            System.out.println(tv);

            tv.setBrand("INVALID");
            System.out.println(tv);
        } catch  (InvalidBrandException e) {
            e.printStackTrace();
        }

        tv.mute();
        System.out.println(tv);
        tv.setVolume(Television.MAX_VOLUME);

        System.out.println(tv);
        tv.setVolume(Television.MAX_VOLUME +1);
        System.out.println(tv);

        tv.setVolume(Television.MIN_VOLUME);
        System.out.println(tv);

        tv.setVolume(Television.MIN_VOLUME -1);
        System.out.println(tv);

    //tv.mute();
        System.out.println(tv);
}
}