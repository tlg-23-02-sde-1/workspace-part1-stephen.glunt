package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

class TelevisionCLI {
    public static void main(String[] args) {
        Television myTv = getTelevisionFromUserInput();

        System.out.println("Thank you for your order!");
        System.out.println("Your custom television has the following specs:");
        System.out.println(myTv);
    }
    private static Television getTelevisionFromUserInput(){
        String brand = null;
        Television myTv = null;

        //need a scanner object to get input from the CLI
        Scanner sc = new Scanner(System.in);
        while(myTv == null){
            System.out.println("Enter the desired brand.");
            System.out.printf("Valid brands are %s.\n", Arrays.toString(Television.VALID_BRANDS));
            //constructor will throw an InvalidBrandException if an incorrect string is passed as a brand.
            try {
                myTv = new Television(sc.nextLine());
            } catch (InvalidBrandException iAe){
                //System.out.println(iAe.getMessage() + ". Try again.");
            }
        }
        boolean valid = false;
        while(!valid){
            System.out.println("Enter the desired volume.");
            System.out.printf("Valid volume is a number in the range of [%s-%s]\n",
                    Television.MIN_VOLUME, Television.MAX_VOLUME);
            //setVolume will throw an IllegalArgumentException if a valid volume isn't provided.
            //Just have the user try again.
            try {
                myTv.setVolume(Integer.parseInt(sc.nextLine()));
                valid = true;
            } catch (IllegalArgumentException msg) {
                //System.out.println(msg.getMessage());
            }
        }
        valid = false;
        while(!valid){
            System.out.println("Enter the desired display.");
            System.out.printf("Valid displays are %s\n", Arrays.toString(DisplayType.values()));
            try {
                myTv.setDisplay(DisplayType.valueOf(sc.nextLine().toUpperCase()));
                valid = true;
            } catch (Exception msg){
                //msg.printStackTrace();
            }
        }
        return  myTv;
    }
}