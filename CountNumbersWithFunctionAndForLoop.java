import java.util.*;

public class CountNumbersWithFunctionAndForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize counts
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        char choice;
        
        do {
            // Get number from user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Update counts based on number entered
            updateCounts(number, positiveCount, negativeCount, zeroCount);
            
            // Ask user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        scanner.close();
        
        // Display counts using a for loop
        displayCountsUsingForLoop(positiveCount, negativeCount, zeroCount);
    }
    
    // Function to update counts based on entered number
    public static void updateCounts(int number, int positiveCount, int negativeCount, int zeroCount) {
        if (number > 0) {
            positiveCount++;
        } else if (number < 0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
    }
    
    // Function to display counts using for loop
    public static void displayCountsUsingForLoop(int positiveCount, int negativeCount, int zeroCount) {
        String[] categories = {"positive", "negative", "zero"};
        int[] counts = {positiveCount, negativeCount, zeroCount};
        
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Count of " + categories[i] + " numbers: " + counts[i]);
        }
    }
}
