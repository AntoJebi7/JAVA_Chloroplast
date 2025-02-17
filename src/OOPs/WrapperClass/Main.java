package OOPs.WrapperClass;

public class Main {
    // allow primitive values (int, char etc.. )
    // to used as objects
    //wrap them in object
    // for use of collections framework
    //and static utility methods

    public static void main(String[] args) {
        //int a = 123;

//        // auto-boxing
//        Integer a = 123;
//        Double b = 3.1;
//        Character c = '%';
//        Boolean d = true;
//        String e = "BMW";
//
//        // unboxing
//        int x = a;
//        double y = b;
//        char z =c;
//        boolean w = d;

        // number to string
        String a = Integer.toString(123);
        String b = Double.toString(123.456);
        String c = Character.toString('a');
        String d = Boolean.toString(true);
        String x = a+" "+b+" "+c+" "+d;
        System.out.println(x);

        // string to number
        int number = Integer.parseInt("123");
        double points = Double.parseDouble("3.14");
        char ch = "String".charAt(0);  // dont have parse method
        boolean ifElse= Boolean.parseBoolean("true");

        System.out.println(number+" "+points+" "+ch+" "+ifElse);

        char letter = '*';
        System.out.println(Character.isLetter(letter));




    }
}
