package Section_3_OOPs.Inheritance;
// subclass can call the constructor of the superclass
// using the super() keyword.
class Animal3 {
    Animal3() {
        System.out.println("Animal created");
    }
}

class Dog3 extends Animal {
    Dog3() {
        super();  // Calls Animal constructor
        System.out.println("Dog created");
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();  // Creates a Dog object
    }
}
