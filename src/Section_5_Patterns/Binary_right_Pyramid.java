package Section_5_Patterns;
/*
aim :

1
01
101
0101
10101

*/
public class Binary_right_Pyramid {
    public static void main(String[] args) {
        int printable = 1;
        for (int row = 0; row < 5; row++) {
            if(row%2==0 ){
                printable =1;
            }else{
                printable = 0;
            }
            for (int col = 0; col <= row; col++) {

                System.out.print(printable);
                printable = 1-printable; // 1 - 1 = 0, 0-1 = 1
            }
            System.out.println();

        }
    }
}
