package Number_Base_Systems;

public class find_power {


    public static void main(String[] args) {
        int power = 3;
        int base = 2;

        System.out.println(find_exponent(base,power));
    }
    public static int find_exponent(int base,int power){
        int result=1;
        while(power!=0){
            result*=base;
            power--;
        }
        return result;
    }
}
