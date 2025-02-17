package OOPs.Abstraction;

// hiding the implementation details
// and showing only the essential features of an object or class.


abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("This animal sleeps");
    }
}

class Dog extends Animal {
    // Providing the implementation of the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Providing the implementation of the abstract method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Calls Dog's sound()
        myDog.sleep();  // Calls Animal's sleep()

        myCat.sound();  // Calls Cat's sound()
        myCat.sleep();  // Calls Animal's sleep()
    }
}
