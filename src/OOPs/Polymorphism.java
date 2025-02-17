package OOPs;


public class Polymorphism {
    public static void main(String[] args) {
        Car_Poly car = new Car_Poly();
        Bike_Poly bike = new Bike_Poly();
        Boat_Poly boat = new Boat_Poly();


        Vehicle_Interface[] vehicles = {car, bike, boat};
        for(Vehicle_Interface v : vehicles){
            v.go();
        }


        car.go();
        bike.go();
        boat.go();
    }
}
