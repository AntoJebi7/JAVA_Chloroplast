package Number_Base_Systems;

public class CharToIntDemo {
    public static void main(String[] args) {
        // Part 1: Show Unicode values of characters '0' to '9'
        System.out.println("Character to Unicode values:");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println("'" + ch + "' = " + (int) ch);
        }

        // Part 2: Convert a single character to int using subtraction
        char singleChar = '7';
        if (Character.isDigit(singleChar)) {
            int value = singleChar - '0';  // 55 - 48 = 7
            System.out.println("\nCharacter '" + singleChar + "' converted to integer: " + value);
        }

        // Part 3: Convert a whole number string to an integer manually (like Integer.parseInt)
        String numberString = "1234";
        int result = 0;

        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);

            if (Character.isDigit(c)) {
                int digit = c - '0';
                result = result * 10 + digit;
            } else {
                System.out.println("Invalid character in number string: " + c);
                return;
            }
        }

        System.out.println("\nConverted string \"" + numberString + "\" to integer: " + result);
    }
}

