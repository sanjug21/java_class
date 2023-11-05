package Java;
import java.util.*;
public class math {
    public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
int a,b;
System.out.print("Enter the first no.: ");
 a=sc.nextInt();
 System.out.print("Enter the second no.: ");
 b=sc.nextInt();
 System.out.println("Max no between "+a+" and "+b+" is : "+Math.max(a, b));
 System.out.println("Min no between "+a+" and "+b+" is : "+Math.min(a, b));
 System.out.println("The square root of "+a+" and "+b+" is: "+Math.sqrt(a)+" & "+Math.sqrt(b));
 
 sc.close();
   }
}
