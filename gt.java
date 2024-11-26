import java.util.*;
public class gt {
    public static void printNumber(int a,int b) {
        if(a > b){
           System.out.println("a is greater");
        }
        
        else if (b > a){
            System.out.println("b is greater");
        }
        else{
            System.out.println(" a and b is equal");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         System.out.println("");
        printNumber(a, b);
}
}
