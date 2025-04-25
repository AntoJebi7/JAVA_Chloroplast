package Section_7_Hacker_Rank;
import java.util.*;  // Import Scanner and Locale
import java.text.*;  // Import NumberFormat for currency formatting
public class day_finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.println("User's Input amount : " +amount);
        sc.close(); //to free system resources
        
        Locale usa_locale = Locale.US; //A Locale object represents a
        // specific geographical, political, or cultural region
        NumberFormat usa_format = NumberFormat.getCurrencyInstance(usa_locale);// dollar
        //NumberFormat is an abstract base class for all number formats.
        //NumberFormat provides methods for determining which locales
        // (US, India, Italy, etc.) have number formats and their names.
        //For US, it is represented like 123,456.789
        System.out.println(usa_format.format(amount)); // dollar + amount


    }
}
