package Section_4_Number_Base_Systems;

public class UnicodeDemo {
    public static void main(String[] args) {
        // Part 1: Show Unicode values of characters and letters (A-Z, a-z)
        System.out.println("Unicode values for digits and letters:");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        // Part 2: Convert lowercase to uppercase and vice versa using ASCII math
        char lower = 'b';
        char upper = (char) (lower - 32);  // 'b' - 32 = 'B'
        System.out.println("\nLowercase 'b' to uppercase: " + upper);

        char upperAgain = 'X';
        char lowerAgain = (char) (upperAgain + 32);  // 'X' + 32 = 'x'
        System.out.println("Uppercase 'X' to lowercase: " + lowerAgain);

        // Part 3: Check if a character is a digit or letter using Character methods
        char c1 = '7';
        char c2 = 'A';
        char c3 = ' ';

        System.out.println("\nIs '7' a digit? " + Character.isDigit(c1));  // true
        System.out.println("Is 'A' a letter? " + Character.isLetter(c2));  // true
        System.out.println("Is ' ' a whitespace? " + Character.isWhitespace(c3));  // true

        // Part 4: Example of Unicode escape characters
        System.out.println("\nUnicode escape characters:");
        System.out.println("New line character: \nThis text is on a new line.");
        System.out.println("Tab character: \tThis is tabbed.");

        // Part 5: Working with strings and Unicode characters
        String str = "Unicode!";
        System.out.println("\nString length: " + str.length());  // 8

        // Checking individual characters in the string
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": '" + str.charAt(i) + "' has Unicode value: " + (int) str.charAt(i));
        }

        // Part 6: Using escape sequences for special characters
        System.out.println("\nUsing escape sequences:");
        System.out.println("This is a backslash: \\");  // Prints a single backslash
        System.out.println("This is a single quote: \'");  // Prints a single quote
        System.out.println("This is a double quote: \"");  // Prints a double quote

        // Part 7: Unicode handling in multi-byte characters (Emoji example)
        String emoji = "😀";  // Unicode emoji
        System.out.println("\nEmoji Unicode: " + emoji + " Unicode value: " + (int) emoji.charAt(0));
    }
}
