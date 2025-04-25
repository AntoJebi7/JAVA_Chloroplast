package Section_3_OOPs;

public class inheritance {
    public static void main(String[] args) {
        inherit_dog dog = new inherit_dog();
        inherit_cat cat = new inherit_cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
// DRY
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.eat();
        cat.eat();
        dog.speak();
        cat.speak();
    }
}
