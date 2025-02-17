package OOPs;

public class Fish implements Predator,Prey{
    @Override
    public void flee(){
        System.out.println("Fish Fleee away");
    }

    @Override
    public void hunt(){
        System.out.println("Fish is Hunting");
    }
}
