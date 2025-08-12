package Section_1_Concepts;
import java.util.Arrays;
public class ArraysExample {
    public static void main(String[] args) {
        // Create an array
        int[] numbers = {5, 2, 9, 1, 7};
        System.out.println(numbers); // address of array
        for(int i=0;i<numbers.length;i++){   // each element in the array
            System.out.println(numbers[i]);
        }
        // 1. Print array nicely
        System.out.println("Original array: " + Arrays.toString(numbers));

        // 2. Sort array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 3. Search for an element (must be sorted first)
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + index);

        // 4. Fill array with one value
        Arrays.fill(numbers, 9);
        System.out.println("After fill: " + Arrays.toString(numbers));

        // 5. Copy array to a larger one
        int[] biggerArray = Arrays.copyOf(numbers, 8);
        // All old values are copied over in order
        //Extra positions are filled with default values (for int, that’s 0)
        System.out.println("Copied to bigger array: " + Arrays.toString(biggerArray));

        // 6. Compare two arrays
        int[] anotherArray = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Arrays equal? " + Arrays.equals(biggerArray, anotherArray));

    }
}
