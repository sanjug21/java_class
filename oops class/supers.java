public class supers {
    public static int pow(int n,int k){
       
        if(k==0)return 1;
        return n*pow(n,k-1);
    }
    public static void pd(int n){
       if(n==0)return;
        pd(n-1);
         System.out.print(n+" ");
        
    }
    public static int first(int a[],int k,int i){
        if(i==a.length)return -1;
        if(a[i]==k )return i;
        return first(a, k, ++i);
      
    }

    public static int fib(int n){
        if(n==1 || n==0)return n;
        return fib(n-1)+fib(n-2);   

    }
    public static int sub(String s,String ans){
        if(s.length()==0){
            
            return 1;
        }
        char c=s.charAt(0);
       
      
        return  sub(s.substring(1),ans)+  sub(s.substring(1),ans+c);
    }
    public static void toss(int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        if((ans.length()==0)||ans.charAt(ans.length()-1)!='H') toss(n,ans+"H");
        toss(n, ans+"T");

    }
    public static void main(String []args){
    System.out.println(sub("abc",  ""));
    //    toss(4, "");
        
    }
}
