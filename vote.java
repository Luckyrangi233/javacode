import java.util.*;

public class vote {
    public static void printAge(int age) {
      System.out.println(" "+ age);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a age  ");
        int age = sc.nextInt();
       
         if (age >= 18)
        {
            System.out.println("eligable for voting");

        }
        else 
        {
            System.out.println("not eligable for voting");

        }
        printAge(age);
    }
    
}
