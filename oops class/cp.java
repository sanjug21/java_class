// import java.util.*;

// public class cp {
//     public static boolean isStable(int no){
//         boolean t=true;
//         int fre=0;
//         HashMap <Integer,Integer>map=new HashMap<>();
//         while(no>0){
//             int rem=no%10;
//             if(map.containsKey(rem)){
//                 map.put(rem, map.get(rem)+1);
//             }
//             else{
//                 map.put(rem, 1);
//             }
//             no/=10;
//         }
        
//         for(int key:map.keySet()){
//             if(t){
//                 fre=map.get(key);
//                 t=false;
//             }
//             else{
//                 if(fre!=map.get(key))return false;
//             }       

//     } return true;
// }
//     public static void main(String[] args) {
//         int ques[]={
//             1234,4225,5555
//         };
//       int st=0;
//       int unst=0;
       

        
//         for(int i=0;i<3;i++){
//          if(isStable(ques[i])){
//             // System.out.println(ques[i]);
//             st+=ques[i];
//          }
//          else unst+=ques[i];
      
     
//     }
//     System.out.println(st-unst);
//     }
// }

interface CarStart  
{    
void start();    
}    
interface CarStop  
{    
void stop();    
}    
public class cp implements CarStart, CarStop  
{    
public void start()  
{  
System.out.println("The car engine has been started.");  
}    
public void stop()  
{  
System.out.println("The car engine has been stopped.");  
}    
public static void main(String args[])  
{    
cp c = new cp();    
c.start();    
c.stop();    
}  
}  