package Section_2_Methods;

import java.util.Scanner;

public class score_game {
    static double Total_Cash = 1000;
    static Scanner inp = new Scanner(System.in);

    static int menu() {
        System.out.println("\nOutfit Store !");
        System.out.printf("Total Cash: %.2f", Total_Cash);
        System.out.println("\n**************");
        System.out.println("Buy clothes: (Choose a number to purchase)");
        System.out.println("1) Hats ");
        System.out.println("2) Shirts ");
        System.out.println("3) Pants ");
        System.out.println("4) Shoes ");
        System.out.println("5) Come back later ");
        System.out.println("**************");
        System.out.print("Enter your choice: ");
        return inp.nextInt();
    }

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            int choosen = menu(); // Ask user for input every loop iteration

            switch (choosen) {
                case 1:
                    System.out.println("You bought a Hat!");
                    break;
                case 2:
                    System.out.println("You bought a Shirt!");
                    break;
                case 3:
                    System.out.println("You bought Pants!");
                    break;
                case 4:
                    System.out.println("You bought Shoes!");
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you! Come again.");
                    break;
                default:
                    System.out.println("Please enter a valid choice!");
            }
        }

        inp.close(); // Close Scanner when done
    }
}
