package run.forest;
/*
 * This is a RunningShoe. This is the business class.
 */

import java.time.LocalDateTime;

public class RunningShoe {

    private String color;
    private ShoeSize size;
    private int miles = 0;
    private ShoeBrand brand;
    private Double price;
    private LocalDateTime lastRunTime;
    public static int MAX_MILES = 1200;



    /**
     * Constructor
     * @param color - primary color of shoe
     * @param brand - brand name of shoe
     * @param size - US sizes
     */
    public RunningShoe(String color, ShoeBrand brand, ShoeSize size){
        this.color = color;
        setBrand(brand);
        this.size = size;
    }


    /**
     * Constructor for RunningShoe
     * @param color - primary color of shoe
     * @param brand - Brand name of shoe
     * @param size - US sizes
     * @param price - in US dollars
     */
    public RunningShoe(String color,ShoeBrand brand, ShoeSize size, Double price){
        this(color, brand, size);
        setPrice(price);
    }

    /**
     * @param miles - number of miles must be greater than or equal to zero.
     * @return returns true if you can still wear these shoes running and false if you shouldn't.
     */
    public boolean wearShoesRunning(int miles){
        if(miles < 0){
            System.out.printf("Invalid value. You can't run %s miles.\n", miles);
        } else {
            System.out.println("You just ran " + miles + " miles.");
            this.miles += miles;
            lastRunTime = LocalDateTime.now();
            if (this.miles > 900 && this.miles < 1000) {
                System.out.println("You should order new shoes.");
            } else if (this.miles >= (MAX_MILES - 200) && this.miles < MAX_MILES) {
                System.out.println("Wear your other shoes for running");
            } else if (this.miles >= MAX_MILES) {
                System.out.println("These shoes are past their recommended lifetime mileage");
            } else {
                System.out.println("These shoes will last " + (MAX_MILES - this.miles) + " more miles.");
            }
        }
        return this.miles < MAX_MILES;
    }


    /**
     * Getter method for shoe size.
     * @return ShoeSize enum
     */
    public ShoeSize getSize() {
        return size;
    }

    /**
     * Getter method for shoe mileage
     * @return int number of miles run in shoe
     */
    public int getMileage() {
        return miles;
    }

    /**
     * Getter method for shoe price
     * @return Double price of shoe
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @return String color of shoe
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return String brand of shoe
     */
    public ShoeBrand getBrand() {
        return brand;
    }

    /**
     *
     * @param brand must be ShoeBrand
     */
    private void setBrand(ShoeBrand brand) {
        this.brand = brand;
    }


    /**
     * Setter method for shoe price. Only accepts values greater than zero.
     * @param price - price of the shoes
     */
    public void setPrice(Double price) {
        if(price == null){
        } else if(price > 0){
            this.price = price;
        } else {
            System.out.printf("Invalid price: %s. Price must be greater than zero.\n", price);
        }
    }

    /**
     *
     * @return LocalDateTime of last run down to seconds.
     */
    public LocalDateTime getLastRunTime() {
        if(lastRunTime == null){
            return null;
        }
        return lastRunTime.withNano(0);
    }

    /**
     * Sets last run time
     * @param lastRunTime
     */
    public void setLastRunTime(LocalDateTime lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    /**
     * Prints stats of this shoe.
     */
    public void printStats() {
        String priceString = (getPrice() == null) ? "null" : String.format("$%.2f", getPrice());
        System.out.println("This pair of " + getColor() + " " + getBrand().name + " shoes cost " +
                priceString + " and have " + getMileage() + " miles on them.");
        System.out.println("Your last run in these shoes was " + getLastRunTime());
    }

    public boolean equals(RunningShoe shoe){
        return (equalsIgnoreSize(shoe) && this.getSize() == shoe.getSize());
    }

    public boolean equalsIgnoreSize(RunningShoe shoe){
        return (this.getColor().equalsIgnoreCase(shoe.getColor()) &&
                this.getBrand() == shoe.getBrand());
    }

    public String toString() {
        return String.format("RunningShoe: color=%s, brand=%s, size=%s, price=%s, miles=%s, lastRunTime=%s.",
                getColor(), getBrand(), getSize(),getPrice(), getMileage(), getLastRunTime());
    }
}