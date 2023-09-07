package animals;

public class Amphibian extends Animal {
    private String environment;

    // constructors                                                --------------------------------------------*********
    public Amphibian(String name) {
        this(name, 0,"Water");
    }

    public Amphibian(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }

    // functional methods                                          --------------------------------------------*********
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }

    @Override
    public void go() {
        System.out.println("Promenade...");
    }
    public void toHunt() {
        System.out.printf("%s hunting%n%n", getName());
    }

    // getters and setters                                         --------------------------------------------*********
    public String getEnvironment() {
        return environment;
    }

    private void setEnvironment(String environment) {
        this.environment = environment == null || environment.isBlank() || environment.isEmpty() ? "Water" : environment;
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s%n" +
                        "Age: %d%n" +
                        "Environment: %s",
                getName(),
                getAge(),
                getEnvironment());
    }
}
