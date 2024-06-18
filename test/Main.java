package test;
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }

}
public class Main {
  
    public static void main(String[] args) {
        
        ListNode node=createList(5,new Scanner(System.in));
        while(node!=null){
            System.out.print(node.val+" "+"->"+" ");
            node=node.next;
        }
    }
    public static ListNode createList(int n,Scanner sc){
        ListNode node=new ListNode(-1);
        ListNode dummy=node;
        for(int i=0;i<n;i++){
            dummy.next=new ListNode(sc.nextInt());
            dummy=dummy.next;
        }
        return node.next;
    }
}

