package Section_3_OOPs;

public class Rectangle extends Shape{

    double width;
    double length;
    public Rectangle(double width, double length ) {
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return  width * length;
    }
}
