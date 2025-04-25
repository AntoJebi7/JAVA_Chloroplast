package Section_2_Methods;

public class scopes {
    static int cash = 1000;


    public static void main(String[] args) {
        System.out.printf("available cash = %d\n" , cash);
        System.out.println("withdraw 100 rupees");
        int donation = givecash()/4;
        int rermaning_cash = cash-100 + donation;
        System.out.println("Donation : "+donation);
        System.out.printf("remaining cash + donation  = %d\n" , rermaning_cash);
    }
    public static int givecash(){
        int donate = 2000;
        return donate;
    }
}
