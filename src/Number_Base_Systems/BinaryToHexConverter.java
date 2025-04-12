package Number_Base_Systems;
import java.util.Scanner;

public class BinaryToHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine().trim();

        // Validate input
        if (!binary.matches("[01]+")) {
            System.out.println("Invalid binary number.");
            return;
        }

        // Inbuilt conversion
        int decimal = Integer.parseInt(binary, 2);
        String hexInbuilt = Integer.toHexString(decimal).toUpperCase();

        // Manual conversion
        String hexManual = convertBinaryToHexManual(binary);

        System.out.println("Binary:      " + binary);
        System.out.println("Hex (Inbuilt): " + hexInbuilt);
        System.out.println("Hex (Manual):  " + hexManual);

        scanner.close();
    }

    // Manual method to convert binary to hexadecimal
    static String convertBinaryToHexManual(String binary) {
        // Pad binary to multiple of 4
        while (binary.length() % 4 != 0) {
            binary = "0" + binary;
        }

        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 4) {
            String chunk = binary.substring(i, i + 4);
            int decimal = binaryToDecimal(chunk);
            hex.append(decimalToHexChar(decimal));
        }
        return hex.toString();
    }

    // Helper: Convert 4-bit binary string to decimal
    static int binaryToDecimal(String bin) {
        int result = 0;
        for (int i = 0; i < bin.length(); i++) {
            result = result * 2 + (bin.charAt(i) - '0');
        }
        return result;
    }

    // Helper: Convert decimal (0–15) to hex character
    static char decimalToHexChar(int decimal) {
        if (decimal < 10) {
            return (char) ('0' + decimal);
        } else {
            return (char) ('A' + (decimal - 10));
        }
    }
}
