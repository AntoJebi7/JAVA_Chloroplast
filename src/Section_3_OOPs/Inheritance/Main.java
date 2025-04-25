package Section_3_OOPs.Inheritance;

class Superclass {
    // Fields and methods of the superclass
    public void display() {
        System.out.println("This is the superclass");
    }
}

class Subclass extends Superclass {
    // Fields and methods of the subclass
    public void show() {
        System.out.println("This is the subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();  // Inherited method from Superclass
        obj.show();     // Method from Subclass
    }
}
