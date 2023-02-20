package gov.abacus;

class CalculatorClient {

    public static void main(String[] args) {

        double sum = Calculator.add(3, 5);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3, 5));

        System.out.println(Calculator.isEven(Calculator.subtract(3, 5)));

        System.out.println(Calculator.subtract(5, 3.5));
        System.out.println(5 / 2);

        /*for (int i = 0; i < 100; i++) {
            System.out.println(Calculator.randomInt());
        }*/
    }
}
