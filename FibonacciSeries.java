
    import java.util.Scanner;

public class FibonacciSeries {

    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms:");
        if (n >= 1) {
            System.out.print(" " + first);
        }
        if (n >= 2) {
            System.out.print(" " + second);
        }

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of terms for Fibonacci series
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        
        // Print Fibonacci series using the function
        printFibonacci(n);
       
    }
}


