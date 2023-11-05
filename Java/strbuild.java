package Java;

public class strbuild {
    public static void main(String Args[])
    {
        StringBuilder sc=new StringBuilder("Hello Sanju");
        
        System.out.println(sc.charAt(0));
        sc.setCharAt(0, 's');
        System.out.println(sc);
        sc.insert(0,'h');
        sc.delete(1, 2);
        System.out.println(sc);
        sc.append(" How are you");
        System.out.println(sc);
        System.out.println("The Length og string is "+sc.length());


    }
}
