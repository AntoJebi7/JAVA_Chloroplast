package Section_4_Number_Base_Systems;

public class BinaryFractionToDecimal {
    public static void main(String[] args) {
        String binary = "101.101";
        String[] parts = binary.split("\\.");

        int integerPart = Integer.parseInt(parts[0], 2); // easy part

        double fractionalPart = 0;
        String frac = parts[1];

        for (int i = 0; i < frac.length(); i++) {
            int bit = frac.charAt(i) - '0';
            fractionalPart += bit * Math.pow(2, -(i + 1));  // power initialy 2 power -1 for fractional part and takes from the left side
        }

        double result = integerPart + fractionalPart;
        System.out.println("Decimal: " + result);
    }
}
