package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Darth Vader");
        try {
            emp.goToWork();
        } catch (WorkException e) {
            //System.out.println(e.getMessage() + " Reason: " + e.getCause().getMessage());
            e.printStackTrace();
        }


    }
}