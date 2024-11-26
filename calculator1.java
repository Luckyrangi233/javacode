import java.util.*;

public class calculator1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    {   int a = sc.nextInt();
        int b = sc.nextInt();
        int addtion = a + b;
        System.out.println(addtion);
    }
    {   int a = sc.nextInt();
        int b = sc.nextInt();
        int subtraction = a - b;
        System.out.println(subtraction);
    }
    
    {   int a = sc.nextInt();
        int b = sc.nextInt();
        int multiplication = a * b;
        System.out.println(multiplication);
    }
    {   int a = sc.nextInt();
        int b = sc.nextInt();
        int division = a / b;
        System.out.println(division);

    }
    {   int a = sc.nextInt();
        int b = sc.nextInt();
        int remainder = a % b;
        System.out.println(remainder);
    }
    
    }
}
