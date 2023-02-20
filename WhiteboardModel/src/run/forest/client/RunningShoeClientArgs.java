package run.forest.client;

import run.forest.RunningShoe;
import run.forest.ShoeBrand;
import run.forest.ShoeSize;

class RunningShoeClientArgs {
    public static void main(String[] args) {
        if(args.length < 3) {
            String usage = "Usage: java RunningShoeClientArgs <color> <brand> <size>";
            String example1 = "Example: java RunningShoeClientArgs White Nike 9.5";
            String usage2 = "java RunningShoeClientArgs <color> <brand> <usSize> <price>";
            String example2 = "Example2: java RunningShoeclientArgs Blue Adidas 7.5 120.00";
            String note = "Note: color and brand can be any string. usSize should be valid US shoe size but " +
                    "will select closest valid size. price cannot be negative.";

            System.out.println(usage);
            System.out.println(example1);
            System.out.println(usage2);
            System.out.println(example2);
            System.out.println(note);
            return;
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");
        String color = args[0];
        ShoeBrand brand = ShoeBrand.getBrand(args[1]);
        ShoeSize size = ShoeSize.findClosestSize(Double.valueOf(args[2]));
        Double price = null;
        if(args.length == 4){
            price = Double.parseDouble(args[3]);
        }

        System.out.printf("%s, %s, %s, %s\n", color, brand, size, price);
        RunningShoe myShoe = new RunningShoe(color, brand, size, price);
        System.out.println(myShoe);
        myShoe.printStats();
    }
}