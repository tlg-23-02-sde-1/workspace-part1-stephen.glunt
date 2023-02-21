package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    public static final double MAX_SALARY = 100000.0;
    public static final double MIN_SALARY = 1000.0;
    public static int generatedEmployees = 0;
    private double salary;

    public SalariedEmployee(String name, LocalDate hireDate){
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    public static SalariedEmployee genEmployee(){
        return new SalariedEmployee("John" + generatedEmployees++,
                LocalDate.of((int) (Math.random() * (2022 - 2000 + 1) + 2000),
                        (int)(Math.random() * (12) +1 ), 5),
                (Math.random() * (MAX_SALARY - MIN_SALARY + 1) + MIN_SALARY));
    }

    public void takeVacation(){
        System.out.printf("%s is going on vacation.\n", getName());
    }

    @Override
    public void pay(){
        System.out.printf("%s is paid salary $%,.2f.\n", getName(), getSalary());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " hireDate=" + getHireDate() +
                " salary=" + getSalary();
    }

    @Override
    public void payTaxes() {
        System.out.printf("%s, %s, paid $%,.2f in taxes.\n", getName(), getClass().getSimpleName(), getSalary() * SALARIED_TAX_RATE);
    }
}