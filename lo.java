
    import java.util.*;
public class lo {
    public static void  printCounts(int number,int positivecounts, int negativecounts, int zerocounts){
        if (number > 0) {
            positiveCounts++;
        } else if (number < 0) {
            negativeCounts++;
        } else {
            zeroCounts++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize counts
        int positiveCounts = 0;
        int negativeCounts = 0;
        int zeroCounts = 0;
     
        
        char choice;
        
        do {
            // Get number from user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            // Update counts based on number entered
            printCount(number, positiveCounts, negativeCounts, zeroCounts);
            
            // Ask user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
       
        
        // Display counts
        System.out.println("Count of positive numbers: " + positiveCounts);
        System.out.println("Count of negative numbers: " + negativeCounts);
        System.out.println("Count of zeros: " + zeroCounts);
    }
}

