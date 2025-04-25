package Section_5_Patterns;
/*
aim:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */
public class Mirror_X_Pattern {
    public static void main(String[] args) {
        int n=5;
        int init_spaces=2*n-2; //8
        for (int i = 1; i <= 2*n-1; i++) {  // stars
            int stars = i; // rows
            if(i>n) stars = 2*n-i; // in loop i =6, 2*5-6 = 10-6 = 4
            for (int j = 1; j <= stars; j++) {  // stars
                System.out.print("*");
            }
            for (int k = 1; k <=init_spaces ; k++) {  // spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {  // stars
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                init_spaces-=2; // till loop 5
            }else{
                init_spaces+=2; // after loop 5
            }

        }
    }
}
