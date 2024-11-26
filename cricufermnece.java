import java.util.*;
public class cricufermnece {
    public static int printCricle(int n){
        int radius = n;
        System.out.println(2*3.14*radius);
         return radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a radius");
        int n = sc.nextInt();
    
      System.out.println("circumfernce is a  ");
        printCricle(n);
    }
}
