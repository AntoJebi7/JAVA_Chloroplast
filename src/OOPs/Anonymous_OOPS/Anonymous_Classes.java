package OOPs.Anonymous_OOPS;

public class Anonymous_Classes {
    // does not have name, cannot reuse
    // often used for timertask, runnable, callbacks, one time uses
    public static void main(String[] args) {
        Dog d = new Dog();
        //Smart_Dog sd = new Smart_Dog();

        Dog d2 = new Dog(){
            @Override
            public void eat() {
                System.out.println("eating - smart");
            }
        };

        d.eat();
        d2.eat();
        //sd.eat();// we dont need to create a whole class for small change

    }
}
