package Section_3_OOPs.Interfaces_OOPS;
// An interface is similar to an abstract class in that it can be used
// to define abstract methods that must be implemented by any class that
// implements the interface


interface Animal {
    // Abstract method (no body)
    void sound();

    // Default method (from Java 8 onwards)
    default void sleep() {
        System.out.println("This animal sleeps");
    }
}

class Dog implements Animal {
    // Implementing the abstract method from the interface
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    // Implementing the abstract method from the interface
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Calls Dog's sound()
        myDog.sleep();  // Calls the default sleep() method from the interface

        myCat.sound();  // Calls Cat's sound()
        myCat.sleep();  // Calls the default sleep() method from the interface
    }
}
