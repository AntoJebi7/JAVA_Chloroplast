package OOPs;

public class Main {
    public static void main(String[] args) {
        array_of_Objects car1 = new array_of_Objects("audi","blue");
        array_of_Objects car2 = new array_of_Objects("Benz","green");
        array_of_Objects car3 = new array_of_Objects("BMW","red");
        // anonymous array of objects
        array_of_Objects[] cars = {new array_of_Objects("tata","violet"),
                                    new array_of_Objects("skoda","orange"),
                                    new array_of_Objects("mahindra","purple"),};
        for(array_of_Objects car : cars){
            car.color = "black";
        }
        for(array_of_Objects car : cars){
            car.drive();
        }
    }
}
