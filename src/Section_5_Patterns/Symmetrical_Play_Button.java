package Section_5_Patterns;

/*

aim :

*
**
***
****
***
**
*


*/


public class Symmetrical_Play_Button {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= (2*n-1); i++) { // outer loop 7 time runs for symmetry
            int stars = i;                   // inner loop corresponds to row
            if(i>n){  // when i greater than row 4 , it starts reducing its stars
                stars=2*n-i;  // at this point stars and i is 5, but we have previous 4 and we need 3 stars now
                // so we use this formula, 2 * 4 - 5 = 8-5 = 3 , think about it :)
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
