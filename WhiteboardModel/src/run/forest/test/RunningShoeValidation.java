package run.forest.test;

import run.forest.RunningShoe;
import run.forest.ShoeBrand;
import run.forest.ShoeSize;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

class RunningShoeValidation {
    public static void main(String[] args) {
        RunningShoe shoe1 = new RunningShoe("Black", ShoeBrand.HOKA, ShoeSize.US_8_5, 99.99);
        RunningShoe shoe2 = new RunningShoe("Black", ShoeBrand.HOKA, ShoeSize.US_6_5);
        RunningShoe shoe3 = new RunningShoe("Black", ShoeBrand.HOKA, ShoeSize.US_8_5);


        //Verify both constructors worked.
        System.out.println(shoe1);
        System.out.println(shoe2);

        //Verify setPrice method
        shoe2.setPrice(-50.0);//Should fail.
        System.out.println(shoe2);//price should be the same

        shoe2.setPrice(45.83);
        System.out.println(shoe2);//price should equal 45.83

        //Verify wearShoesRunning
        shoe1.wearShoesRunning(10);//Should print number of miles run and how long they will last.
        System.out.println(shoe1.getLastRunTime()); //Should equal current time.

        shoe1.setLastRunTime(LocalDateTime.of(2023, 1, 12, 12, 30));
        System.out.println(shoe1.getLastRunTime()); //Should be 2023-01-12T12:30

        //Test invalid distance
        shoe1.wearShoesRunning(-5);
        System.out.println(shoe1.getLastRunTime()); //Should equal 2023-01-12T12:30

        //Test that valid distance updates the shoe properly
        shoe1.wearShoesRunning(55);
        shoe1.printStats();

        //Test both equals methods
        System.out.println(shoe1.equalsIgnoreSize(shoe2)); //Should  be true
        System.out.println(shoe1.equals(shoe2)); //Should be false
        System.out.println(shoe1.equals(shoe3)); //Should be true

    }
}