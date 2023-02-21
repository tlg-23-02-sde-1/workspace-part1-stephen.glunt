package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate){
        super(name, hireDate);
//        this.setName(name);
//        this.setHireDate(hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
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

    @Override
    public void payTaxes() {
        System.out.printf("%s payed $%,.2f in taxes.\n", getName(), getRate() * getHours() * HOURLY_TAX_RATE);
    }
}