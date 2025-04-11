package Number_Base_Systems;

public class binary_to_decimal {
    public static void main(String[] args) {
        // automatic
        String binary_number = "1010";
        int decimal_number = Integer.parseInt(binary_number,2);  // '2' means base 2 (binary)
        System.out.println(decimal_number);

        // manual
        String binary = "1010";
        int decimal = 0;
        int power = 0; // power initially 2 power 0 for first digit or one digit

        for(int i = binary.length()-1;i>=0;i--){
            int current_bit = binary.charAt(i)-'0';
            decimal+=current_bit*Math.pow(2,power);
            power++;
        }
        System.out.println("binary to decimal of "+ binary + " is " + decimal);

    }
}
