package Section_4_Number_Base_Systems;

public class decimal_to_hexadecimal {
    public static void main(String[] args) {
        // automatic
        int decimal = 348;
        String hexa_decimal = Integer.toHexString(decimal);
        System.out.println(hexa_decimal.toUpperCase());

        // automatic
        // String hex = "";  stings are immutable
        StringBuilder hex = new StringBuilder();
        char[] hex_values= "0123456789ABCDEF".toCharArray();  // '0', '1' , '2' ... 'A' , 'B' .....
        while(decimal>0){
            int remainder = decimal % 16;
            // hex += hex_values[remainder] + hex;
            // In Java, String is immutable, so each time you do result +=
            // you're actually creating a new string object, which is inefficient especially in large loops.
            // so we are using string builder
            hex.insert(0, hex_values[remainder]);
            decimal/=16;
        }
        System.out.println(hex);
    }
}
