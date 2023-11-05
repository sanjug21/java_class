import java.util.*;
public class ques {
    public static void main(String []args){
            int num=1000;
            ArrayList<Integer> lst=new ArrayList<>();
            int j=0;
            int mul=10;
            while(num!=0){
                int rem=num%10;
                if(rem==0)continue;
                else{
                    lst.add(rem*mul*j++);
                }
            }
            System.out.println("cfhfghv");
            System.out.println(j+"\n"+lst);

    
}}
