package OOPs;

public class constructors {
    public static void main(String[] args) {
        students student_1 = new students("anto",30,true);
        students student_2 = new students();

        System.out.println(student_1.name);
        System.out.println(student_2.name);
        student_2.study();
    }
}
