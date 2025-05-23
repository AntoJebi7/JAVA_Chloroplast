package Section_6_Problems_Basic;

public class prime_pairs {

    public static void main(String[] args) {
        int number = 7;
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {

            // condition for i to be a prime number
            if (checkPrime(i)) {

                // condition for n-i to be a prime number
                if (checkPrime(number - i)) {

                    // n = primeNumber1 + primeNumber2
                    System.out.printf("%d = %d + %d\n", number, i, number - i);
                    flag = true;
                }

            }
        }

        if (!flag)
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    }

    // Function to check prime number
    static boolean checkPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}