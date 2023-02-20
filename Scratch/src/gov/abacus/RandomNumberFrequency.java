package gov.abacus;

class RandomNumberFrequency {

    public static void main(String[] args) {
        int numTimes = 100;
        int[] randomNums = new int[20];
        for(int i = 0; i < numTimes; i++){
            int num = Calculator.randomInt(1,20);
            randomNums[num - 1]++;
        }
        double average = 0;
        for(int num : randomNums){
            average += num;
        }
        average /= 20;

        System.out.printf("The average number of times a number was called out of %s is %s.\n", numTimes, average);

        for (int i = 0; i < randomNums.length; i++){
            double deviation = 100 * Math.abs(randomNums[i] - average)/average;
            System.out.printf("%2d was returned %4d times and deviates %2.1f from the mean.\n", i + 1, randomNums[i], deviation);
        }
    }
}