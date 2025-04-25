package Section_3_OOPs.Composition;

public class Main {
    public static void main(String[] args) {
        // part-of relationship between objects
        // engine is a part of a car
        Car car = new Car("Bmw",2025,"V8 Engine");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);
        car.start();
    }
}
