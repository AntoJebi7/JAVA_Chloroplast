package OOPs.Threading;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    // Allows program to run multiple tasks simultaneously
    // improve performance
    // background tasks ,network comm etc.
    // to create :
    // 1. Extend Thread class - simple
    // 2. Implement Runnable Interface - better
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name in 5 seconds , ");
        RunnableClass runnable = new RunnableClass();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true); // exits program when main thread is over
        thread.start();
        System.out.println("Enter your name now :");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);



        sc.close();
    }
}
