package Section_1_Concepts;

import java.util.Scanner;

public class Multiline_Inputs {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("enter your message : ");

        while(true){
            String getInp = inp.nextLine();
            if(getInp.isEmpty()){
                break;
            }

            sb.append(getInp).append("\n");
        }

        inp.close();

        System.out.println(sb.toString());


    }
}
