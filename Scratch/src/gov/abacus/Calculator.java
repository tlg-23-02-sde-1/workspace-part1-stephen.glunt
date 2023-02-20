package gov.abacus;

class Calculator {
    public static final double PI = 3.1415926589793;

    /**
     * Returns the mean (average) of all integers
     */
    public static Double mean(int first, int ...rest){
        return add(first, rest)/(rest.length + 1);
    }


    public static double add(int first, int ...nums){
        for(int num : nums){
            first += num;
        }
        return first;
    }

    public static int subtract(int first, int ...rest){
        for(int num : rest){
            first -= num;
        }
        return first;
    }
    public static double subtract(double first, double ...rest) {
        for(double num : rest){
            first -= num;
        }
        return first;
    }

    public static int multiply(int n1, int ...rest) {
        for(int num : rest){
            n1 *= num;
        }
        return n1;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }

    public static int divide(int n1, int n2) {
        return n1 / n2;
    }

    public static long exponent(int num, int exp) {
        return (long) Math.pow(num, exp);
    }


    /**
     * Returns a random integer between 1 and 14 (inclusive).
     */
    public static int randomInt() {
        return randomInt(1, 14);
    }

    public static int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int randomInt(int max) {
        return randomInt(1, max);
    }
}