package OOPs;

public class Person {
    String first;
    String last;
    Person(String first, String last) {
        this.first = first;
        this.last = last;

    }
    void showname(){
        System.out.println(this.first+ " " +this.last);
    }
}
