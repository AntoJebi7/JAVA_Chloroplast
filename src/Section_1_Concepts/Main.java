package Section_1_Concepts;

class Car {
    String color = "Red";
    int speed = 120;

    void drive() {
        System.out.println("The car is driving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Creating an object
        System.out.println("Car Color: " + myCar.color);
        myCar.drive();
    }
}
