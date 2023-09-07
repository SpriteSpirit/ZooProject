package animals;

public class Mammals extends Animal {
    private String environment;
    private float moveSpeed;

    // constructors                                                --------------------------------------------*********
    public Mammals(String name) {
        this(name, 0, "drought");
    }

    public Mammals(String name, int age, String environment) {
        super(name, age);
        this.environment = environment;
    }

    // functional methods                                          --------------------------------------------*********
    public void walk() {
        System.out.printf("%s walking with %.2f speed",getName(), getMoveSpeed());
    }

    // getters and setters                                         --------------------------------------------*********
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if (environment != null && !environment.isBlank() && !environment.isEmpty()) {
            this.environment = environment;
        }
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        if (moveSpeed > 0) {
            this.moveSpeed = moveSpeed;
        } else {
            this.moveSpeed = Math.abs(moveSpeed);
        }
    }
}
