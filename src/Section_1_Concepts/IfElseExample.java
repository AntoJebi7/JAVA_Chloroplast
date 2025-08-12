package Section_1_Concepts;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

    }
}
