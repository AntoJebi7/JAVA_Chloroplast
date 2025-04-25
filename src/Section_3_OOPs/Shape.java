package Section_3_OOPs;

public abstract class Shape {
    abstract double area(); //abstract method


    void display() {
        // concrete method
        System.out.println("Area is: " + area());
    }
}
