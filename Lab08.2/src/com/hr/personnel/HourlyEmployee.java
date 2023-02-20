package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate){
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public void pay(){
        System.out.printf("%s is paid hourly $%,.2f.\n", getName(), getRate() * getHours());
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +
                " rate=" + getRate() +
                ", hours=" + getHours();
    }
}