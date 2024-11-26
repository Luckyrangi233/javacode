public class MultiplicationTable {

    // Function to print the table of a given number
    public static void printTable(int n) {
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Change this number to print tables of different numbers

        printTable(number);
    }
}
