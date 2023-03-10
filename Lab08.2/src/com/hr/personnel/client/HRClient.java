/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new HourlyEmployee("Jason", LocalDate.of(1990, 8, 24), 60.0, 40));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 8000.0));
        dept.addEmployee(new HourlyEmployee("Mike", LocalDate.of(2011, 5, 4), 21.59, 45.0));
        dept.addEmployee(new SalariedEmployee("Sherlock", LocalDate.of(1890, 12, 25), 40000.0));
        dept.addEmployee(new Executive("Stephen", LocalDate.of(2005, 06, 21), 50000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("Pay the employees:");
        dept.payEmployees();

        System.out.println("Vacation time!");
        dept.holidayBreak();
    }
}