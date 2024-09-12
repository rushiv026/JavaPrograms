package doubly;

import org.w3c.dom.NamedNodeMap;

import javax.swing.plaf.nimbus.NimbusStyle;

public class first {
    static Node head;
    static class Node
    {
        int data;
        Node pre;
        Node next;
        Node(int data)
        {
            this.data=data;


        }
    }
    static class doubltlinklist
    {

        public static void insertstart(int data)
        {
            Node newnode=new Node(data);
            if(head==null)
            {
                head=newnode;
                head.pre=null;
                head.next=null;
                return;
            }
            head.pre=newnode;
            newnode.next=head;
            newnode.pre=null;
            head=newnode;

        }
        public void addlast(int data)
        {
            Node newnode=new Node(data);
            if(head==null)
            {
                head=newnode;
                head.pre=null;
                head.next=null;
            }
            Node current=head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
            newnode.next=null;

        }
        public void printlist()
        {
            if(head==null)
            {
                return;
            }
            Node curent=head;
            while (curent!=null)
            {
                System.out.print(curent.data+"->");
                curent=curent.next;
            }
            System.out.println("NULL");
        }
        public static void deletefirst()
        {
            if(head==null)
            {
                return;
            }
            head=head.next;
            head.pre=null;
        }
        public static void deletelast()
        {
            if(head==null)
            {
                return;
            }
            Node secondlast=head;
            Node last=head.next;
            while (last.next!=null)
            {
                last=last.next;
                secondlast=secondlast.next;

            }
            secondlast.next=null;
        }
    }


    public static void main(String[] args) {
        doubltlinklist d=new doubltlinklist();
        d.insertstart(10);
        d.printlist();
        d.insertstart(20);
        d.printlist();
        d.addlast(30);
        d.printlist();
        d.addlast(40);
        d.printlist();
        d.deletefirst();
        d.printlist();
        d.deletelast();
        d.printlist();

    }
}
