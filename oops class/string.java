

public class string {
    public static boolean isValid (String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))return false;
        }
        return true;
    }
    public static void main(String[]args){
        // String s="nitin";
        // for(int i=0;i<s.length();i++){
        //   for(int j=i+1;j<=s.length();j++){
        //       String str=s.substring(i, j);
        //       if(isValid(str))System.out.println(str);
        //   }

          String su="hello";
          String rev="";
          for(int i=su.length()-1;i>=0;i--){
            rev+=su.charAt(i);
          }
          System.out.println(rev);

        
//               s=s.trim();
//         int len=s.length();
//        int st=len,end=len;
//        while(st>=0)
//        {
//            while(st>0 && s.charAt(st)!=' ')st--;
//            rev+=s.substring(st+1,end+1);
//            while(st>0 && s.charAt(st)==' ')st--;
//            end=st;
//        }
// return rev;

    }
    
}
