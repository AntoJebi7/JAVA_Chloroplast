package Section_5_Patterns;
/*
aim :
(and variations)
11111
22222
33333
44444
55555

*/
public class Main {
    public static void main(String[] args) {
        // basic square for understanding
        // run it before refer it

        for(int k=1;k<=5;k++){
            System.out.println(k);   // vertical line
        }
        System.out.println();
        for(int i=1;i<=5;i++){ // row
            for(int j=1;j<=5;j++){ // column
                System.out.print(i);     // square
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=5;i++){ // row
            for(int j=1;j<=5;j++){ // column
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
