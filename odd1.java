import java.util.*;

public class odd1 {
    public static int sumodd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int sumOfOdds = sumodd(n);
        System.out.println("Sum of odd numbers up to " + n + " is: " + sumOfOdds);
        
        sc.close();
    }
}
