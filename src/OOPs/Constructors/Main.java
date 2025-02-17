package OOPs.Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car ;



        Scanner input = new Scanner(System.in);
        String getCarName = input.nextLine();
        if(getCarName.equalsIgnoreCase("bmw")) {
            car = new Car("Bmw",4566);
            Car car2 = new Car(car);
        }else if(getCarName.equalsIgnoreCase("audi")){
            car = new Car("Audi");
        }else{
            car = new Car();
        }




    }
}
