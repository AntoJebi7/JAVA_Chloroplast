package Section_3_OOPs;

public class students {
    String name;
    int age;
    boolean enrolled;

    // constructor - same name of class
    students(String name, int age, boolean enrolled){
        this.name = name;
        this.age = age;
        this.enrolled = enrolled;
    }
    students(){
        this.name="empty";
    }
    void study(){
        System.out.println(this.name + " is studying");
    }


}
