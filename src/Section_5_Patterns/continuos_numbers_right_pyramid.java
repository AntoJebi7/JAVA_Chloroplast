package Section_5_Patterns;
/*
aim :

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

A
B C
D E F
G H I J
K L M N O

*/
public class continuos_numbers_right_pyramid {
    public static void main(String[] args) {

        // continuous numbers
        int numbers=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(numbers+" ");
                numbers++;
            }
            System.out.println();
        }
        System.out.println();
        // continuous letters
        int a = 65;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char) a+" ");
                a++;
            }
            System.out.println();
        }

        // continuous letters

        int letters = 65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){

                System.out.print((char) letters+" ");
                letters++;
            }
            letters = 65;

            System.out.println();
        }
        System.out.println();
        // reverse
        int lette = 65;
        for(int i=1;i<=5;i++){ // row
            for(int j=1;j<=(5-i+1);j++){  // column

                System.out.print((char) lette+" ");
                lette++;
            }
            lette = 65;

            System.out.println();
        }

    }
}
