public class PrimeCheck {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and below are not prime numbers
        }
        
        // Check from 2 to sqrt(n) if n is divisible by any number
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor other than 1 and n, hence not prime
            }
        }
        return true; // If no divisors found, number is prime
    }

    public static void main(String[] args) {
        int number = 45; // Change this number to test different cases

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
