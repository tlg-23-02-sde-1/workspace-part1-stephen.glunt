package run.forest.client;/*
 * This is the client class for RunningShoe. This class implements the RunningShoe object and plays around with it.
 */

import run.forest.RunningShoe;
import run.forest.ShoeBrand;
import run.forest.ShoeSize;

import java.util.Scanner;

class RunningShoeClient {
    public static void main(String[] args) {
        RunningShoe myShoe1 = new RunningShoe("Red", ShoeBrand.NIKE, ShoeSize.US_9_5, 150.0);
        System.out.println("The price is $" + myShoe1.getSize());

        // Go running in your shoes until you use them up.
        while (myShoe1.wearShoesRunning(4 + (int) (Math.random() * ((50 - 4) + 1)))) {
            System.out.println("Your shoes have " + myShoe1.getMileage() + " miles on them.");
        }
        myShoe1.printStats();
        RunningShoe myShoe2 = getNewShoe();

        myShoe2.wearShoesRunning(26);
        myShoe2.printStats();
        System.out.println(myShoe2);
    }

    static RunningShoe getNewShoe(){
        ShoeBrand brand = null;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("You need new shoes. What brand do you want?");
            sc = new Scanner(System.in);
            brand = ShoeBrand.getBrand(sc.nextLine());
        } while (brand == null);

        System.out.println("What color of shoes do you want?");
        String color = sc.nextLine();
        ShoeSize usSize = null;
        String response = "n";
        do {
            System.out.println("What size shoes do you want?");
            double size = sc.nextDouble();
            sc.nextLine();
            usSize = ShoeSize.findClosestSize(size);
            System.out.println("The closest size I could find is " + usSize.getSize() + ". Is this the size you want (yes/no)?");
            response = sc.nextLine();
        }while(!response.equalsIgnoreCase("yes"));
        System.out.println("How much do you want to spend on your shoes?");
        double price = sc.nextDouble();
        RunningShoe myShoe = new RunningShoe(color, brand, usSize, price);
        return myShoe;
    }
}