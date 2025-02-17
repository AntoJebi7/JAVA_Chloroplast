package OOPs;

public class abstraction {
        // hiding implementation details
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Triangle t = new Triangle(4,5);
        Rectangle r = new Rectangle(6,7);

        c.display();
        t.display();
        r.display();
    }
}
