package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work(){
        System.out.printf("%s is working... at the beach.\n", getName());
    }
}