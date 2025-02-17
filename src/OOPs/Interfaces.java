package OOPs;

public class Interfaces {
    // blueprint for a class
    // specifies set pf abstract methods
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Hawk h = new Hawk();
        Fish f = new Fish();


        f.flee();
        f.hunt();
        h.hunt();
        r.flee();
    }
}
