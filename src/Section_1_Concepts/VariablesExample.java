package Section_1_Concepts;

public class VariablesExample {
    public static void main(String[] args) {
        // declare & initialize
        // labeled storage in memory that holds data while program runs
        int age = 25;
        double pi = 3.1415;
        float four_byte = 100;
        char grade = 'A';
        boolean isJavaFun = true;
        byte a = 100;
        String name = "Anto"; //  Reference Types (store addresses to objects)
        // Here, name doesn’t store "Alice" directly —
        // it stores a reference (link) to where "Alice" is stored in memory.

        System.out.println("Age: " + age);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println(a);
        System.out.println(four_byte);
        System.out.println(name);
    }
}
