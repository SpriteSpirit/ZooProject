package animals;

public class Herbivore extends Mammals{
    private String foodType;
    // constructors                                                --------------------------------------------*********
    public Herbivore(String name) {
        this(name, 0, "Grass");
    }

    public Herbivore(String name, int age, String foodType) {
        super(name, age);
        setFoodType(foodType);
    }

    // functional methods                                          --------------------------------------------*********
    public void toGaze() {
        System.out.printf("%s to gazing%n%n", getName());
    }

    // getters and setters                                         --------------------------------------------*********
    public String getFoodType() {
        return foodType;
    }

    private void setFoodType(String foodType) {
        this.foodType = foodType == null || foodType.isBlank() || foodType.isEmpty() ? "Savannah" : foodType;
    }

    @Override
    public String toString() {
        return String.format(
                "Type: %s%n" +
                        "Age: %d%n" +
                        "Food type: %s",
                getName(),
                getAge(),
                getFoodType());
    }
}