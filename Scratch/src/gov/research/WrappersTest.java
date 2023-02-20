package gov.research;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "56";
        int age = Integer.parseInt(ageInput);

        Integer ageInteger = Integer.valueOf(ageInput);

        String popInput = "7000000000";
        long pop = Long.parseLong(popInput);
        long popLong = Long.valueOf(popInput);

        String priceInput = "2359.99";
        double price = Double.parseDouble(priceInput);
        Long priceLong = Long.valueOf(priceInput);

        String truth = "true";
        boolean result = Boolean.parseBoolean(truth);
        Boolean resultBool = Boolean.valueOf(truth);
    }
}