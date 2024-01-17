package DataStructues;

public class LinkedList {
    Node head;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        public void add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                return;
            }
            Node traverse=head;
            while(traverse.next!=null){
                traverse=traverse.next;
            }
            traverse.next=head;
        }
    }
    
}
