package Section_7_Hacker_Rank;

import java.util.Scanner;

public class Java_Loops_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");

            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (Exception e) {
            System.out.println("Number is too large for long data type!");
        }

        sc.close();
    }
}
