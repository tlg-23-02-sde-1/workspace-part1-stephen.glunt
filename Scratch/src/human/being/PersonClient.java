package human.being;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", LocalDate.of(1980,7,5));

        System.out.println(p1);
        System.out.printf("%s is %s years old.", p1.getName(), p1.age());

    }
}