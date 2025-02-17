package OOPs.Inheritance;
// A class inherits from another class, and that class
// inherits from another class, forming a chain.
class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy1 extends Dog1 {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy1 myPuppy = new Puppy1();
        myPuppy.sound();  // Inherited from Animal
        myPuppy.bark();   // Inherited from Dog
        myPuppy.play();   // Method from Puppy
    }
}
