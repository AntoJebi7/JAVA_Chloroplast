package Concepts;

import java.util.Random;

public class Random_Numbers {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(1+9,5+90);
        System.out.println(number);
        double result = Math.pow(2, 5+1);
        System.out.println(result);

    }
}
