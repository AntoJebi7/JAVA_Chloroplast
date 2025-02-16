package OOPs;

public class car {
    String model="BMW";
    int year = 2005;
    double price = 657896.6;
    boolean condition = true ;

    void start(){
        condition = true ;
        System.out.println(model + " engine started");
    }
    void stop(){
        condition = false ;
        System.out.println(model + " engine turned off " );
    }

    car(String model, int year, double price, boolean condition){
        this.model = model;
        this.year = year;
        this.price = price;
        this.condition = condition;
    }

    @Override
    public String toString(){
        return this.model + " " + this.year + " " + this.price + " " + this.condition;
    }



}
