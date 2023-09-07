import animals.*;

public class Main {
    public static void main(String[] args) {
        Mammals lion = new Mammals("Lion", 5, 0, "");
        System.out.println(lion);
        lion.toWalk();

        Amphibian salamander = new Amphibian("Salamander", 2, "");
        System.out.println(salamander);
        salamander.toHunt();

        Bird sparrow = new Bird("Sparrow", 1, "City");
        System.out.println(sparrow);
        sparrow.toHunt();

        // Herbivore class objects
        Herbivore gazelle = new Herbivore("Gazelle", 3, "Grass");
        System.out.println(gazelle);
        gazelle.toGaze();

        Herbivore giraffe = new Herbivore("Giraffe", 5, "Leaf");
        System.out.println(giraffe);
        giraffe.toGaze();

        Herbivore horse = new Herbivore("Horse", 7, "Hay");
        System.out.println(horse);
        horse.toGaze();
        horse.eat();
        horse.sleep();
        horse.go();

        // Predator class objects
        Predator hyena = new Predator("Hyena", 2, "Carrion");
        System.out.println(hyena);
        hyena.toHunt();

        Predator tiger = new Predator("Tiger", 4, "Meat");
        System.out.println(tiger);
        tiger.toHunt();

        Predator bear = new Predator("Bear", 8, "Meat");
        System.out.println(bear);
        bear.toHunt();


        // Amphibian class objects
        Amphibian frog = new Amphibian("Frog", 2, "Swamp");
        System.out.println(frog);
        frog.toHunt();

        Amphibian freshwaterSnake = new Amphibian("Freshwater snake", 3, "Lake");
        System.out.println(freshwaterSnake);
        freshwaterSnake.toHunt();


        // FlightBird class objects
        FlightBird gull = new FlightBird("Gull", 1, "Forest", "Fly");
        System.out.println(gull);
        gull.toFly();
        gull.toHunt();

        FlightBird albatross = new FlightBird("Albatross", 3, "Sea", "Fly");
        System.out.println(albatross);
        albatross.toFly();
        albatross.toHunt();

        FlightBird falcon = new FlightBird("Falcon", 15, "Mountains", "Fly");
        System.out.println(gull);
        falcon.toFly();
        falcon.toHunt();


        // FlightlessBird class objects
        FlightlessBirds peacock = new FlightlessBirds("Peacock", 5, "Hill", "Walk");
        System.out.println(peacock);
        peacock.toFly();
        peacock.toHunt();

        FlightlessBirds penguin = new FlightlessBirds("Penguin", 3, "Arctic", "Walk");
        System.out.println(penguin);
        penguin.toFly();
        penguin.toHunt();

        FlightlessBirds dodoBird = new FlightlessBirds("Dodo Bird", 2, "Hill", "Walk");
        System.out.println(dodoBird);
        dodoBird.toFly();
        dodoBird.toHunt();
    }
}