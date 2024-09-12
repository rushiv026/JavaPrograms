package doubly;

public class siglycircular {
    static Node head;static Node tail;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public static void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=head;

        }
        else {
            Node temp=head;
            newnode.next=temp;
            head=newnode;
            tail.next=head;
        }
    }
    public static void addlast(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=head;
        }
      tail.next=newnode;
        tail=newnode;
        tail.next=head;

    }

    public static void deletefirst()
    {
        if(head==null)
        {
            return;

        }
        head=head.next;
        tail.next=head;
    }
    public static void deletelast()
    {
        if(head==null)
        {
            return;
        }
        Node current=head;
        while (current.next!=tail)
        {
           current= current.next;
        }
        tail=current;
        tail.next=head;
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
        System.out.println();
    }

    public static void main(String[] args) {
        siglycircular s=new siglycircular();
        s.addfirst(10);
        s.printall();



    }
}
