package Section_3_OOPs;

public class Circle extends Shape{

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double area() {
        return Math.PI * radius * radius; // pi r square
    }
}
