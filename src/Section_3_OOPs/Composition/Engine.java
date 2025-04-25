package Section_3_OOPs.Composition;

public class Engine {
    String type;
    Engine(String type) {
        this.type = type;
    }

    void start(){
        System.out.println("you started the "+type);
    }

}
