package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;
import com.entertainment.VolumeLevel;

import java.util.Arrays;

/**
 * Intended usage (by human):
 * $ java TelevisionClientArgs <brand> <volume> <display>
 * <p>
 * Example:
 * $ java TelevisionClientArgs Samsung 32 PLASMA
 * <p>
 * GOAL:
 * Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            String note1 = String.format("Valid volume levels are between %s and %s.",
                    Television.MIN_VOLUME, Television.MAX_VOLUME);
            String note = "Valid brands are " + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            System.out.println(note1);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }


        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");


        String brand = args[0];
        int volume;
        try {
            volume = Integer.parseInt(args[1]);
        } catch (NumberFormatException nfe) {
            volume = VolumeLevel.valueOf(args[1].toUpperCase()).getValue();
        }

        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        Television tv1 = new Television(brand, volume, display);
        System.out.println(tv1);
    }
}