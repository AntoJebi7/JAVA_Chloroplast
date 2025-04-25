package Section_3_OOPs;

public class super_keyword {
    //refer to parent class
    //used in contructors and method overiding
    // calls the parent constructor
    public static void main(String[] args) {
        Person person = new Person("anto","jebi");
        Student student = new Student("anto","aj",56.8);
        student.showname();
        student.showgpa();
        Employee emp = new Employee("emp-dolo","salao",900);
        emp.show_salary();
    }
}
