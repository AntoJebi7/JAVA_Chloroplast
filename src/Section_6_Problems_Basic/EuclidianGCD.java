package Section_6_Problems_Basic;

import java.util.Scanner;

public class EuclidianGCD {
           // a = q b + r   formula
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);  // a = b , b = remainder
    }
    public static int LCM(int a, int b, int c){
        // ( a * b ) / gcd (a,b)
         return (a*b/c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(21,300) );

        // also find lcm with this
        System.out.println(LCM(a,b,GCD(a,b)));
    }
}
