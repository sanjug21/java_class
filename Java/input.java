package Java;

import java.util.*;

public class input{
    
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
System.out.print("Enter the Size of array: ");
int size=scan.nextInt();
int array[]=new int[size];
System.out.println("Enter the elments of the array");
for(int i=0;i<size;i++){
    System.out.print("Enter the "+(i+1)+" elment: ");
    array[i]=scan.nextInt();

}
System.out.println("The given array is:"+"\t");
for(int i=0;i<size;i++){
    System.out.println("The "+(i+0)+" element is "+array[i]);
}
scan.close();
// System.out.println(5/10);

}


}