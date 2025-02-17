package OOPs.getters_setters;

public class Car {
    private  String color;
    private int year;
    private final String model;
    Car(String color, int year, String model){
        this.color = color;
        this.year = year;
        this.model = model;

    }

    String getModel(){
        return this.model;
    }
    int getYear(){
        return this.year;
    }
    String getColor(){
        return this.color;
    }

    void setColor(String color){
        this.color = color;
    }
    void setYear(int year){
        this.year = year;
    }
//    void setModel(String model){
//        this.model = model;
//    }
}
