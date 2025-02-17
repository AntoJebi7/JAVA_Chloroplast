package OOPs.Inheritance;
// Multiple subclasses inherit from the same superclass.
class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat2 extends Animal2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.sound();  // Inherited from Animal
        myDog.bark();   // Method from Dog

        Cat2 myCat = new Cat2();
        myCat.sound();  // Inherited from Animal
        myCat.meow();   // Method from Cat
    }
}

