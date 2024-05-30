package objects;

// Create two derived classes Dog and Cat that extend Animal.
// Override the makeSound method in each derived class to print a sound specific to the animal.
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing...");
    }

}
