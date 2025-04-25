package Section_4_Number_Base_Systems;

public class hexadecimal_to_decimal {
    public static void main(String[] args) {
        // automatic
        String hex_form = "23E";
        int decimal_number = Integer.parseInt(hex_form,16);
        System.out.println(decimal_number);

        // manual
        String hex = "23E";
        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int value;

            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                value = 10 + (c - 'A');  //  10 to 15 eg : 10 + 1 = 15
                // suppose c = 'B'
                // then value = 10 + ( 'B' - 'A' ) = 10 + 1 = 11 ,
                // becuase 66-65 = 1 , 10 + 1 = 11
            } else if (c >= 'a' && c <= 'f') {
                value = 10 + (c - 'a'); // similarly 10 to 15
            } else {
                throw new IllegalArgumentException("Invalid hex character: " + c);
            }

            decimal = decimal * 16 + value;  //  Why multiply by 16?
            // Every new digit in hexadecimal is worth 16 times more than the one after it
            // so, we multiply every new digit or value by 16 before adding it
            // "Shift the digits left" (by multiplying by 16)
            // "Add the new digit"
        }

        System.out.println("Decimal: " + decimal); // Output: 6719
    }
}
