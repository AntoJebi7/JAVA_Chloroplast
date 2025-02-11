package Concepts;

import java.io.*;

public class Bufferreader {
    public static void main(String[] args) throws IOException {

       //InputStreamReader ISR = new InputStreamReader(System.in); // or
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter Message");

        String Lines = br.readLine();
        System.out.println(Lines);

        br.close();


    }
}
