package Java;
import java.util.*;

public class function {
 public static int fact(int i){
    if(i==0)
    {return 1;}
    else return i*fact(i-1);
 }


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
      int i=sc.nextInt();
       System.out.println(fact(i));
   
   sc.close();
}


}