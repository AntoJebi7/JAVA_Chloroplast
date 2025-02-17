package OOPs.MethodOverRiding;

class Animal {
    // Method in superclass
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    /*
    when a subclass provides a specific implementation
    for a method that is already defined in its superclass.
    * */
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Calls Animal's makeSound()

        Animal myDog = new Dog();  // Dog object, but Animal reference
        myDog.makeSound();  // Calls Dog's overridden makeSound()

        Animal myCat = new Cat();  // Cat object, but Animal reference
        myCat.makeSound();
    }
      // Calls Cat's overridden makeSound()


}
