package OOPs;

public class overloading {
        // user
    String name ;
    String email;
    int age;

    overloading(String n){
        this.name = n;
        this.email = "empty email";
        this.age = 10;
    }
    overloading(String n, String e){
        this.name = n;
        this.email = e;
        this.age = 30;
    }
    overloading(String n, String e, int a){
        this.name = n;
        this.email = e;
        this.age = a;
    }

}
