package Section_5_Patterns;

/*

aim :

*      *
**    **
***  ***
********


*/

public class twin_pyramid {
    public static void main(String[] args) {
        int rows = 4;
        int space = (2*(rows-1));
        for (int i = 1; i <= rows; i++) { // rows 4
            for (int n = 1; n <= i; n++) { // numbers , initially we need 1 , increases by 1
                System.out.print("*");
            }
            for (int s = 1; s<=space; s++) { // space , initially we need 6 , decreases by 2
                System.out.print(" ");
            }
            for (int n = i; n >= 1; n--) { // numbers , initially we need 1 but its reverse order , decreses
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
    }
}
