package Section_3_OOPs;

public class Student extends Person{
    double grade;
    Student(String first , String Last,double grade){
        super(first,Last);
        this.grade = grade;
    }
    void showgpa(){
        System.out.println(this.first + " gpa is " + this.grade);
    }
}
