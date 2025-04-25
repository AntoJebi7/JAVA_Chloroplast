package Section_3_OOPs.Constructors;

public class Car {
    String name;
    int year;

    // default constructor
    // Using this() to Call Another Constructor
    /*
    Calls the default constructor.
    Inside the default constructor,
    this("Empty", 0); calls the parameterized constructor.
    * */
    Car(){
        this("Empty",0);
        System.out.println("Default Constructor");
    }

    // parameterized constructor
    Car(String name){
        this.name = name;
        System.out.println("Car name is " + this.name);
    }
    // constructor overloading
    Car(String name, int year){
        this.name = name;
        System.out.println("Car name is " + this.name);
        this.year = year;
        System.out.println("Model release date : " + this.year);
    }

    // Copy Constructor creates a new object
    // by copying values from an existing object.

    Car(Car AnotherCar){
        this.name = AnotherCar.name;
        this.year = AnotherCar.year;
        System.out.println("car2 copied car1 values");
    }

}
