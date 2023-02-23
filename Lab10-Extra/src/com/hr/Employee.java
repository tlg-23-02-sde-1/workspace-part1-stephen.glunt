package com.hr;

import com.hr.client.WorkException;
import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    /*
     * 4.
     */
    public void goToWork() throws WorkException {
        Car myCar = new Car("TK421", "Imperial", "Tie Fighter");
        myCar.start();
        try {
            myCar.moveTo("West Seattle"); //West Seattle
        }
        catch (DestinationUnreachableException e){
            System.out.println("Send email to Lisa Herbold to complain.");
            throw new WorkException("Unable to get to work.", e);
        }
        finally {
            myCar.stop();
        }
        System.out.println("Arrived at work");
    }

    // BUSINESS METHODS

    /*
     * 3. Catch and rethrow
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car myCar = new Car("TK421", "Imperial", "Tie Fighter");
//        myCar.start();
//        try {
//            myCar.moveTo("West Seattle"); //West Seattle
//        }
//        catch (DestinationUnreachableException e){
//            System.out.println("Send email to Lisa Herbold to complain.");
//            throw e;
//        }
//        finally {
//            myCar.stop();
//        }
//        System.out.println("Arrived at work");
//    }

    /*
     * 2. "punt"
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car myCar = new Car("TK421", "Imperial", "Tie Fighter");
//        myCar.start();
//        try {
//            myCar.moveTo("West Seattle"); //West Seattle
//        } finally {
//            myCar.stop();
//        }
//        System.out.println("Arrived at work");
//    }


    /*
     * 1. try-catch and handle any thrown exception.
     */
//    public void goToWork() {
//        Car myCar = new Car("TK421", "Imperial", "Tie Fighter");
//        myCar.start();
//        try {
//            myCar.moveTo("West Seattle"); //West Seattle
//        } catch (DestinationUnreachableException e) {
//            e.printStackTrace();
//        }
//        finally {
//            myCar.stop();
//        }
//        System.out.println("Arrived at work");
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}