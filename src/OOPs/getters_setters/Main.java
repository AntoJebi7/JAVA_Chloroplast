package OOPs.getters_setters;

public class Main {
    public static void main(String[] args) {
        // help protect object data and add rules
        //getters - methods to make field readable
        //setters - methods that make field writable

        Car car = new Car("blue",3000,"tesla");
        //car.model= "Ford";
        car.setYear(2020);
        car.setColor("purple");
        System.out.println(car.getYear()+"\t"+car.getModel()+"\t"+car.getColor());
    }
}
