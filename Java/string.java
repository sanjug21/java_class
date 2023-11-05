package Java;
import java.util.*;
public class string {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String sanju="Hey Shubham, How are you";
        System.out.print("How many Time You want to print : ");
        int times=scan.nextInt();
        for (int i=1;i<=times;i++){
            System.out.println(sanju);
        }
        //     System.out.print("Enter the String: ");
        // String sanju=scan.nextLine();
        // System.out.println(sanju);
        // System.out.println(sanju.concat("hey"));  
        // System.out.println(sanju +=" hello");
        
        // System.out.println("The length of the string is: "+sanju.length());
        scan.close();
    }
    
}
