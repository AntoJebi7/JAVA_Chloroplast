package Section_1_Concepts;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Input_Basics {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 1. Reading a Single Word
        System.out.print("Enter a single word: ");
        String singleWord = scanner.next();
        System.out.println("You entered: " + singleWord);

        // Consume the leftover newline character
        scanner.nextLine();

        // 2. Reading a Full Line
        System.out.print("Enter a full sentence: ");
        String fullLine = scanner.nextLine();
        System.out.println("You entered: " + fullLine);

        // 3. Reading Space-Separated Values
        System.out.print("Enter two space-separated numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        // Consume the leftover newline character
        scanner.nextLine();

        // 4. Reading Multiple Lines (Paragraph) Using BufferedReader
        System.out.println("Enter a paragraph (end with an empty line):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder paragraph = new StringBuilder();
        String line;
        while (!(line = reader.readLine()).isEmpty()) {
            paragraph.append(line).append("\n");
        }
        System.out.println("Your paragraph:\n" + paragraph);

        // 5. Reading Password (Using Console)
        Console console = System.console();
        if (console != null) {
            char[] password = console.readPassword("Enter your password: ");
            System.out.println("Password length: " + password.length);
        } else {
            System.out.println("Console not available. Run in a terminal for password input.");
        }


        // Closing resources
        scanner.close();
    }
}
