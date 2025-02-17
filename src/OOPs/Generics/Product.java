package OOPs.Generics;

public class Product<T,U,V> {

    T item;
    U price;
    V quantity;

    Product(T item, U price, V quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    public T getItem() {
        return this.item;
    }
    public U getPrice() {
        return this.price;
    }
    public V getQuantity() {
        return this.quantity;
    }

}
