package custom;

import java.util.Scanner;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            System.out.println("list have only one element");
            return;
        }
        Node last;
        Node secondlast;

        last=head.next;
        secondlast=head;

        while(last.next!=null){
            secondlast=secondlast.next;
            last=last.next;
        }
        secondlast.next=null;

    }
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 int track=1,data;
 Scanner in=new Scanner(System.in);
         while (track!=5){
             System.out.println("1.insert\t2.deletelast\t3.deletefirst\t4.display\t5.stop");

             switch (track) {
                 case 1 -> {
                     System.out.println("enter data");
                     data = in.nextInt();
                     list.insert(data);
                 }
                 case 2 -> list.deletelast();
                 case 3 -> list.deletefirst();
                 case 4 -> list.display();
             }
            track=in.nextInt();
        }

    }
}
