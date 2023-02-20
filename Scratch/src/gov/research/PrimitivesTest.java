package gov.research;

class PrimitivesTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println("You are " + i + " years old!");
        }
        long population = 7_000_000_000L;
        System.out.println("The population is " + population + ".");

        double pi = 3.14159265379;
        System.out.println("I like " + pi);
        System.out.println("My favorite word is \"belly\".");
        String word = "moist";
        String myWord = word;
        word = myWord.toUpperCase();
    }
}