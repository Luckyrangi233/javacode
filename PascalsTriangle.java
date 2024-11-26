public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5; // Number of rows in Pascal's Triangle

        // 2D array to store Pascal's Triangle
        int[][] triangle = new int[numRows][numRows];

        // Fill Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Each row starts and ends with 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Fill the rest of the elements
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for alignment
            for (int k = 0; k < numRows - i - 1; k++) {
                System.out.print(" ");
            }
            
            // Print each element in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

