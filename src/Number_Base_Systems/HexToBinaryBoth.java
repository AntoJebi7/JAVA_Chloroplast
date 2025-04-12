package Number_Base_Systems;
import java.util.Scanner;

public class HexToBinaryBoth {

    // Manual method: Convert each hex digit to 4-bit binary string
    public static String hexCharToBinary(char hexChar) {
        return switch (Character.toUpperCase(hexChar)) {
            case '0' -> "0000";
            case '1' -> "0001";
            case '2' -> "0010";
            case '3' -> "0011";
            case '4' -> "0100";
            case '5' -> "0101";
            case '6' -> "0110";
            case '7' -> "0111";
            case '8' -> "1000";
            case '9' -> "1001";
            case 'A' -> "1010";
            case 'B' -> "1011";
            case 'C' -> "1100";
            case 'D' -> "1101";
            case 'E' -> "1110";
            case 'F' -> "1111";
            default -> null;
        };
    }

    // Manual conversion
    public static String manualHexToBinary(String hex) {
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < hex.length(); i++) {
            String bin = hexCharToBinary(hex.charAt(i));
            if (bin == null) return null; // invalid char
            binary.append(bin);
        }
        return binary.toString();
    }

    // Built-in conversion
    public static String builtinHexToBinary(String hex) {
        try {
            int decimal = Integer.parseInt(hex, 16);
            return Integer.toBinaryString(decimal);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine().trim();

        String manualBinary = manualHexToBinary(hex);
        String builtinBinary = builtinHexToBinary(hex);

        if (manualBinary == null || builtinBinary == null) {
            System.out.println("Invalid hexadecimal input.");
        } else {
            System.out.println("Manual Conversion:  " + manualBinary);
            System.out.println("Built-in Conversion: " + builtinBinary);
        }

        scanner.close();
    }
}
