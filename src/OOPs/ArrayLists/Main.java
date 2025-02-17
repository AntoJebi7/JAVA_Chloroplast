package OOPs.ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // resizable array that stores objects or autoboxing
        // diamond operator <>
        ArrayList<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(2);
        list.add(3);

        System.out.println( list);

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.2);
        list1.add(1.3);
        list1.add(1.4);

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Coconut");
        list2.remove("Apple"); // or index 0
        list2.set(1,"orange");


        System.out.println(list2);
        System.out.println(list2.get(1));
        System.out.println(list2.size());


        // to sort the array

        Collections.sort(list2);
        System.out.println(list2);

        for(String eachElement : list2){
            System.out.println(eachElement);
        }







    }
}
