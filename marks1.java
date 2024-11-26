import java.util.*;
public class marks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("enter a marks");
        int marks = sc.nextInt();
        int i = 0;
        do { 
            System.out.println("press enter  0   or 1 ");
            
            i = sc.nextInt();
             
               System.out.println(i);
               i = i + 100;
          }  while (i < 100);
          if(marks >= 90)
       {
        System.out.println("this is exeleent");
       }
       else if (marks >= 60)
       {
        System.out.println("this is also good");
       }
       else if (marks >= 0)
       {
        System.out.println("this is good as well");
       }
       else 
       {
        System.out.println("invalid marks");
       }

       }
    }
      
    
    
    

