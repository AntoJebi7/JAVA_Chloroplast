package OOPs.Generics;

import java.util.ArrayList;

public class Main {
    // generics - we can write class, interface, method, compatible
    // of diff data types
    //<T> type parameter that gets replaced with real type
    // eg - <String> specifies the type
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        // custom generic class
        // Accepts String
        Box<String> box = new Box<>();
        box.setItem("apple");
        System.out.println(box.getItem());

        // Accepts Integer
        Box<Integer> box2 = new Box<>();
        box2.setItem(45);
        System.out.println(box2.getItem());

        // Accepts Double
        Box<Double> box3 = new Box<>();
        box3.setItem(3.14);
        System.out.println(box3.getItem());

        // two or more different types
        Product<String,Double,Integer> product = new Product<>("Samsung",
                34.67,3);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());

    }
}
