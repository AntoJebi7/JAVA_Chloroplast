package Section_3_OOPs;

public class Employee extends Person {
    int salary;
    public Employee(String first, String last, int salary) {
        super(first,last);
        this.salary = salary;
    }
    void show_salary(){
        System.out.println(this.first+" salary is $" +this.salary);
    }
}
