package OOPs;



public class sample {
    public static void main(String[] args) {
        car car = new car("ford",2000,45000,true);
        car new_car = new car("ford",2000,45000,true);

        System.out.println(car.model);
        System.out.println(car.condition);
        car.start();
        System.out.println(car.condition);
        car.stop();
        System.out.println(car.condition);

        overloading old = new overloading("anto");
        System.out.println(old.age);
        System.out.println(old.email);

        overloading new1 = new overloading("anto-jebi-7","ajd@email.com");
        System.out.println(new1.email);
        System.out.println(new1.age);

        overloading new2 = new overloading("anto","abcd",56);
        System.out.println(new2.age);
        System.out.println(new2.email);
    }
}
