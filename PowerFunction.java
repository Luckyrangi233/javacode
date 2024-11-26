import java.util.Scanner;

public class PowerFunction {

    // Function to calculate power of x raised to the power of n
    public static double power(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input x
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        
        // Input n
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        
        // Calculate power using the function
        double result = power(x, n);
        
        // Display the result
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        
        scanner.close();
    }
}
