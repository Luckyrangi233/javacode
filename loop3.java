import java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i=1; i<3; i++)
         {
            System.out.println(i);

         }
         if(n % 2 == 0)
        {
            System.out.println("even");

        }
        else
        {
            System.out.println("odd");

        }
    }
}