import java.util.ArrayList;

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
    public static int subSequence(String s,String ans){
        if(s.length()==0){
            
            return 1;
        }
        char c=s.charAt(0);
       
      
        return  subSequence(s.substring(1),ans)+  subSequence(s.substring(1),ans+c);
    }
    public static void toss(int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        if((ans.length()==0)||ans.charAt(ans.length()-1)!='H') toss(n,ans+"H");
        toss(n, ans+"T");
    }

    public static void dice(int i,int n,ArrayList<String> ans,String s){
        if( i>n)return;
        if( i==n){
            ans.add(s);
            return;
        }
        dice(i+1,n,ans,s+1);
        dice(i+2,n,ans,s+2);
        dice(i+3,n,ans,s+3);
        
    }
    public static void dicePath(int face,int n,int i,String s,ArrayList<String> ans){
        if(i>n)return;
        if(i==n){
            ans.add(s);
            return;
        }
        for(int curr=1;curr<=face;curr++){
            dicePath(face, n, i+curr, s+curr, ans);
        }
    }

    public static void allPaths(int a,int b,int c,int d,String s){
        if(a>=c || b>=d)return;
        if(a==c-1 && b==d-1){
            System.out.println(s);
            return;
        }
        allPaths(a+1, b, c, d, s+"H");
        allPaths(a, b+1, c, d, s+"V");
    }

    public static void permutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        boolean visited[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(visited[c-'a']==false){
                visited[c-'a']=true;
            String newStr=s.substring(0, i)+s.substring(i+1);
            permutation(newStr, ans+c);}
        }
    }
    public static void main(String []args){
    ArrayList<String> ans=new ArrayList<>();
        // allPaths(0, 0, 3, 3, "");
        permutation("aabb", "");
        
    }
}
