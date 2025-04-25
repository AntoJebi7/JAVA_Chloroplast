package Section_3_OOPs.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // an event that interrupts the normal flow of program
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a Number ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a String ");
            String str = sc.nextLine();
        }catch(InputMismatchException e){
            System.out.println(e + " error captured");
        }catch(Exception e) { // to capture all exceptions
            System.out.println(e + " Some error");
        }finally { // default block , always executes
            System.out.println("handled well");
            sc.close();
        }


    }
}
