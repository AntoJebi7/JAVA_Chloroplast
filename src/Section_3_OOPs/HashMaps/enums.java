package Section_3_OOPs.HashMaps;


import java.util.Scanner;

public class enums {
    // fixed set of constants
    // improve code readability and more efficient with switches
    // rather than comparing strings
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day : ");
        String day = sc.nextLine().toUpperCase();

        try {
            ENUM_class enc = ENUM_class.valueOf(day);
            System.out.println(enc);
            System.out.println(enc.getValue());

            switch (enc) {

                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("WeekDay");

                case SUNDAY,
                     SATURDAY -> System.out.println("Weekend");

            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
