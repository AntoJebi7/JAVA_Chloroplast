package OOPs.Polymorphism_OOPS;
// Run time polymorphism - method overRiding
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Runtime_Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal object
        Animal myDog = new Dog();        // Dog object, but Animal reference
        Animal myCat = new Cat();        // Cat object, but Animal reference

        myAnimal.makeSound();   // Calls Animal's makeSound()
        myDog.makeSound();      // Calls Dog's makeSound() (overridden)
        myCat.makeSound();      // Calls Cat's makeSound() (overridden)
    }
}

