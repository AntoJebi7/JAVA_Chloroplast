package Concepts;

public class the_2d_arrays {
    public static void main(String[] args) {
        int[] fruits = {434,5 ,46,465 };
        String[] fruit = {"apple","orange","banana", "pear"};
        String[] vegetables = {"carrot","beetroot","cabbage","onion"};

        String[][] products = {fruit,vegetables};
        for(String[] frui_vege : products){
            for(String from_frui_vege : frui_vege){
                System.out.println(from_frui_vege);
            }
        }
    }
}
