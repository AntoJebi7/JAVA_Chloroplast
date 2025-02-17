package OOPs.Inheritance;
// A subclass inherits from only one superclass.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Inherited method
        myDog.bark();   // Method from Dog
    }
}
