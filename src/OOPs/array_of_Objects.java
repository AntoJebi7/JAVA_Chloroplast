package OOPs;

public class array_of_Objects {
    String model;
    String color;
    array_of_Objects(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void drive(){
        System.out.println("your car to drive is "+ this.color + " " +model);
    }
}
