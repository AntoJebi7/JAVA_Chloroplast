package Section_1_Concepts;

import java.io.*;

public class Bufferreader {
    public static void main(String[] args) throws IOException {

       //InputStreamReader ISR = new InputStreamReader(System.in); // or
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("enter Message");
//
//        String Lines = br.readLine();
//        System.out.println(Lines);
        InputStreamReader ins = new InputStreamReader(System.in);
        BufferedReader brr = new BufferedReader(ins);


        System.out.println("enter your name : " );
        String name = brr.readLine();
        System.out.println(name);

        brr.close();


    }
}
