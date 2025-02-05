package Concepts;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        System.out.println(3 + 90);
        int age = 80;
        System.out.println(age);
        double db = 89.345;
        System.out.println("the float value is " + db);
        char abc = 'a';
        System.out.println(abc);
        boolean a = true;
        System.out.println(!a);

        String name = "Anto";
        System.out.println("hello " + name);


        Scanner getInput = new Scanner(System.in);
        System.out.println("enter your name");
        String names = getInput.nextLine();
        System.out.println(names);

        getInput.close();
    }
}
