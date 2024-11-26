import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking number of rows and columns as input
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initializing the 2D array
        int[][] numbers = new int[rows][cols];

        // Taking input for the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Displaying the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Closing the scanner
        sc.close();
    }
}

