package Concepts;
import java.util.Arrays;


public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }




int[] original = {1, 2, 3, 4};
int[] copy = Arrays.copyOf(original, original.length);  // Copy entire array
    }
}
