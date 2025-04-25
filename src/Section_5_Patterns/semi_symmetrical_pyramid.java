package Section_5_Patterns;


/*
aim :

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/

public class semi_symmetrical_pyramid {
    public static void main(String[] args) {
        // straight pyramid
        int total_rows = 5;
        for (int i = 0; i < total_rows; i++) {
            for (int s = 0; s < (total_rows - i - 1); s++) {
                System.out.print(" ");      // space
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");     // stars
            }
            for (int s = 0; s < (total_rows - i - 1); s++) {
                System.out.print(" ");        // space
            }
            System.out.println();
        }
        // reverse pyramid
        int rows = 5;
        for(int i=0; i<rows; i++ ) {
            // space
            for(int s = 0;s<i;s++){
                System.out.print(" ");
            }
            //stars 2n - (2i+1)
            for(int j =0;j<((2*rows)-(2*i+1));j++){
                System.out.print("*");
            }
            // space
            for(int s = 0;s<i;s++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
