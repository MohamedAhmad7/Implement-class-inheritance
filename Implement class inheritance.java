// Animal class
public class Animal {
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("Checking if the animal is a mammal.");
    }

    public void mate() {
        System.out.println("Animal is looking for a mate.");
    }

    public static void main(String[] args) {
        // Creating objects
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        // Calling public methods from Animal class
        myAnimal.isMammal();
        myAnimal.mate();

        // Calling public methods from Zebra class
        myZebra.isMammal(); // Inherited from Animal
        myZebra.mate(); // Inherited from Animal
        myZebra.run(); // Zebra-specific method
    }
}

// Fish class inheriting from Animal
class Fish extends Animal {
    private int sizeInFeet;

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish.");
    }
}

// Zebra class inheriting from Animal
class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        System.out.println("The zebra is running in the wild.");
    }
}
