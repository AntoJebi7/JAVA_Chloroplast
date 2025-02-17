package OOPs.RunTime_Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal animal ;
        System.out.println(" would you like a dog or cat ?");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                animal = new Dog();
                animal.speak();
            case 2:
                animal = new Cat();
                animal.speak();
            default:
                animal = new Dog();
                animal.speak();
        }


    }
}
