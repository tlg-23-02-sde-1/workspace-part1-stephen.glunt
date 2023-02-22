/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp.client;

import com.hr.corp.Corporation;
import com.hr.personnel.Employee;
import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IRS;

import java.time.LocalDate;

class TaxClient {
    
    public static void main(String[] args) {
        // create the IRS
        IRS irs = new IRS();
        
        // create the Corporation and register it with the IRS
        Corporation corp = new Corporation("HR, Inc.");
//        Employee hrly1 = new HourlyEmployee("Mike", LocalDate.of(2009, 12, 25),40.25, 60.0);
//        Employee slry1 = new SalariedEmployee("John", LocalDate.of(2011, 5, 5), 40000.25);
//        irs.register(corp, hrly1, slry1);

        Employee[] employees = new Employee[20];
        for(int i = 0; i < employees.length; i++){
            employees[i] = SalariedEmployee.genEmployee();
            i++;
            employees[i] = new HourlyEmployee("Jason" + i,  LocalDate.of(1990, 8, i), 22.5, 5.0 * i);
        }
        irs.register(corp, employees);

        // create Employees (Hourly or Salaried), and register them with the IRS
        // TODO: uncomment this block once you make employees taxpayers also
        //irs.register(new HourlyEmployee("Jason",  LocalDate.of(1990, 8, 24), 22.5, 40.0));
        irs.register(new SalariedEmployee("Tina", LocalDate.of(2000, 2, 2), 1250.0));
        irs.register(new HourlyEmployee("John",   LocalDate.of(2010, 10, 11), 25.0, 40.0));
        irs.register(new Executive("Jane", LocalDate.of(2005, 7, 1), 1500.0));

        // IRS collects taxes
        System.out.println("IRS collects taxes:");
        irs.collectTaxes();
    }
}