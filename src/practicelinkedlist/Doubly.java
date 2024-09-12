package practicelinkedlist;

public class Doubly {

    static Node head,tail;
    static class Node
    {
        int data;
        Node pre;
        Node next;
        Node(int d)
        {
            this.data=d;

        }


    }

    static class Demodoubly
    {
        public static void add(int data)
        {
            Node n=new Node(data);
            if(head==null)
            {
                head=n;
                tail=n;
                head.pre=null;
                head.next=null;
                return;
            }
            tail.next=n;
            tail=n;
            tail.next=head;



        }
        public static void print()
        {
            if(head==null)
            {
                System.out.println("null");
                return;
            }
            Node curr=head;
            System.out.print(curr.data+"->");
            curr=curr.next;
            while (curr!=head)
            {
                System.out.print(curr.data+"->");
                curr=curr.next;
            }

        }
    }
    public static void main(String[] args) {

        Demodoubly d=new Demodoubly();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.print();

    }
}
