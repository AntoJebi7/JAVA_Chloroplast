package Number_Base_Systems;

public class decimal_to_binary {
    public static void main(String[] args) {
        // automatic
        int decimal = 10;
        String Binary = Integer.toBinaryString(decimal);
        System.out.println(Binary);

        // manual
        int decimal_number = decimal;
        String Binary_number = "";
        // for binary = base 2 , so divide by 2
        while(decimal_number != 0) {
            int remainder = decimal_number % 2;
            Binary_number = remainder + Binary_number;
            decimal_number = decimal_number / 2;
        }
        System.out.println("binary number of " + decimal + " decimal number is " + Binary_number);
    }
}
