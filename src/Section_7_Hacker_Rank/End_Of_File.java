package Section_7_Hacker_Rank;

import java.util.Scanner;

public class End_Of_File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1; // To track line numbers (optional)

        while (sc.hasNextLine()) {  // Reads until EOF (End of File)
            String input = sc.nextLine();
            System.out.println(lineNumber + " " + input);
            lineNumber++;  // Increment line count
        }

        sc.close();
    }
}
