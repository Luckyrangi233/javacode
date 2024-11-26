import java.util.*;
public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         boolean isPrime = true;
         for(int i=2; i<n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
         }
         if(isPrime){
            if(n == 1)
            {
                System.out.println("this is prime not composite");
            }
            else  {
                System.out.println("this is prime");
            }
        }
            else {
                System.out.println("this is not prime no");
            }
         }
        }
    

