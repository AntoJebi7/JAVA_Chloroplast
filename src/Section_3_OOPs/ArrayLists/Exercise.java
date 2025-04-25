package Section_3_OOPs.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.println("enter the no of food to add :");
        int numOfFood = input.nextInt();
        input.nextLine();
        for(int i = 0; i < numOfFood; i++){
            System.out.println("enter food no  "+(i+1) + ": ");
            foods.add(input.nextLine());
        }
        for(String eachFood : foods){
            System.out.println(eachFood);
        }

        input.close();
    }
}
