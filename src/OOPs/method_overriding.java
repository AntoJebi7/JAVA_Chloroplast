package OOPs;

public class method_overriding {
    // subclass provides its own implementation of a method that is
    // defined already // code reusability
    public static void main(String[] args) {
        inherit_dog dog = new inherit_dog();
        inherit_cat cat = new inherit_cat();
        inherit_fish fish = new inherit_fish();



        dog.move();
        cat.move();
        fish.move();
    }

}
