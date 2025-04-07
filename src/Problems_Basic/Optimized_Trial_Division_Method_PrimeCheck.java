package Problems_Basic;

public class Optimized_Trial_Division_Method_PrimeCheck {
    public static boolean CheckPrime(int n){
        if (n <= 1) return false;           // 0 and 1 are not prime
        if (n == 2 || n == 3) return true;  // 2 and 3 are prime
        // Step 2: Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;
             // 5 * 5 < 45 = > 25 < 45  true
        // 6 * 6 < 45 = > 36 < 45  true
        // 7 * 7 < 45 => 49 < 45  false
        for(int i =5; i*i < n ;i+=6){  // square root so we check in advance  like square root of loop number is less dhan the given number
            if(n%i==0 || (n%(i+2)==0)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[] num = {1,23,45,465,56,67,78,78,5,7};
        for(int number : num){
            System.out.println("NUmber is " + CheckPrime(number));
        }

    }
}
