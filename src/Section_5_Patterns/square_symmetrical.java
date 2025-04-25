package Section_5_Patterns;
/*
aim:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */
public class square_symmetrical {

    public static void main(String[] args) {
        // contains above part and below part
        // above part
        for (int a = 0; a < 5; a++) { // rows
            // stars
            for (int b = 1; b <=5-a; b++) {
                System.out.print("*");
            }
            // spaces
            for(int c = 0; c < (2*a); c++) {
                System.out.print(" ");
            }
            // stars
            for (int b = 1; b <=5-a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // below part
        int init_space = 8;
        for (int a = 1; a <= 5; a++) { // rows
            // stars
            for (int b = 1; b <=a; b++) {
                System.out.print("*");
            }
            // spaces
            for(int c = 0; c < init_space; c++) {
                System.out.print(" ");
            }
            // stars
            for (int b = 1; b <=a; b++) {
                System.out.print("*");
            }
            System.out.println();
            init_space-=2;
        }

    }
}
