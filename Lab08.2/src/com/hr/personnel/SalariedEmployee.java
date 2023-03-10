package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, LocalDate hireDate){
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
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
}