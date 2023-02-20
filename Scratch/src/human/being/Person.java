package human.being;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    public int age(){
        return (int) ChronoUnit.YEARS.between(birthdate, LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String toString(){
        return String.format("Person: name=%s, birthdate=%s", getName(), getBirthdate());
    }
}