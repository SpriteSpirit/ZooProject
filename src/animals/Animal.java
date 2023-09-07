package animals;

import java.time.LocalDate;

public class Animal {
    private String name;
    private final int birthYear;

    // constructors                                                --------------------------------------------*********
    public Animal(String name) {
        this(name, 0);
    }

    public Animal(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);;
        }
    }
    // functional methods                                          --------------------------------------------*********
    public void eat() {

    }

    public void sleep() {

    }

    public void go() {

    }
    // getters and setters                                         --------------------------------------------*********
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }
}
