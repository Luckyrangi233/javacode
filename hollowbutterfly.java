public class hollowbutterfly {
    public static void main(String[] args) {
        int size = 5; // Size of the butterfly pattern

        // Upper part of the butterfly (including the middle line)
        for (int i = 1; i <= size; i++) {
            // Left part of the upper wing
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Space between wings
            for (int j = 1; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            
            // Right part of the upper wing
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Move to the next line after each row of the upper wing
            System.out.println();
        }
        
        // Lower part of the butterfly (excluding the middle line)
        for (int i = size; i >= 1; i--) {
            // Left part of the lower wing
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Space between wings
            for (int j = 1; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            
            // Right part of the lower wing
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Move to the next line after each row of the lower wing
            System.out.println();
        }
    }
}
