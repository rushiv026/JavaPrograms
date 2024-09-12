package doubly;

import java.util.Optional;

public class doublycircular {
    static Node head;
    static Node tail;
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;

        }
    }
    public static void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;

        }
        else {
            newnode.next=head.prev;
            tail.next=newnode.prev;
            head=newnode;
        }
    }
    public static void printall()
    {
        if(head==null)
        {
            return;
        }
        Node current=head;
        do{
            System.out.print(current.data+"->");
            current=current.next;
        }while (current!=head);

    }

    public static void main(String[] args) {
        doublycircular d=new doublycircular();
        d.addfirst(10);
        d.addfirst(20);
        d.addfirst(30);
        d.addfirst(40);

        d.printall();

    }
}
