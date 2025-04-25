package Section_3_OOPs.Generics;

public class Box<Temp> {
    Temp item;
    public void setItem(Temp item) {
        this.item = item;
    }
    public Temp getItem() {
        return this.item;
    }

}
