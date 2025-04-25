package Section_5_Patterns;

/*
aim:

E
DE
CDE
BCDE
ABCDE
 */
public class reverse_order_letter_pyramid {
    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            for (char ch = (char) ('E'- i); ch<='E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
