package Java.recursion;

public class combo{
public static void combO(String a,int idx,String b){
    if(a.length() == 0) {
        System.out.println(b);
        return;
    }
   
    for(int i=0; i<a.length(); i++) {
        char currChar = a.charAt(i);
        String newStr = a.substring(0, i) + a.substring(i+1);
        combO(newStr, idx+1, b+currChar);
    }
}



    public static void main(String Args []){
        String sc="abc";
        combO(sc,0,"");
    }
}