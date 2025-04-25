package Section_1_Concepts;

public class varargs {
    public static void main(String[] args) {
        add(33,43,43,4,434);
    }
    static int add(int...arr){
        int sum =0;
        int size = arr.length;
        int average;
        for(int num : arr){
            sum+=num;
        }
        average = sum/size;
        System.out.println(average);
        return 0;
    }
}
