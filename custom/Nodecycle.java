class Node1{
    int val;
    Node1 next;

    Node1(int val){
        this.val=val;
        next=null;
    }
}
public class Nodecycle {
    public static void main(String[] args) {
        Node1 a=new Node1(1);
        Node1 b=new Node1(2);
        Node1 c=new Node1(3);
        Node1 d=new Node1(4);

        a.next=b;
        b.next=c;
        c.next=d;
//        d.next=a;
        System.out.println(hasCycle(a));
    }
    public static boolean hasCycle(Node1 head){
        Node1 slow=head,fast=head;
        while(  fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }


}
