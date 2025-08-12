package Section_1_Concepts;
import java.lang.*;
public class StringBuilder_Buffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hi, ");
        sb.append("Hello World");
        sb.replace(0,1,"b");
        int a = 10;
        double b = (double) a;
        System.out.println(b);
        System.err.println(sb);
        StringBuffer sbf = new StringBuffer("Anto");
        sbf.append(" jebikshan");
        System.out.println(sbf);

        StringBuilder sb1 = new StringBuilder("Hello");

        sb1.append(" World");  // Append
        sb1.insert(5, ",");  // Insert
        sb1.replace(0, 5, "Hi");  // Replace
        sb1.delete(2, 4);  // Delete
        sb1.reverse();  // Reverse


        System.out.println(sb1.toString());
    }
}
