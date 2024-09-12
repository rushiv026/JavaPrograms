package practicelinkedlist;

public class Singly {

    static Node head;
    static Node tail;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static class Abc {
        public static void addElement(int data) {
            Node n = new Node(data);

            if (head == null) {
                head = n;
                tail = n;
                head.next = null;
            }
            tail.next = n;
            tail = n;

        }

        public static void print()
        {
            if(head==null)
            {
                System.out.println("Linked list is Empty");
                return;
            }
            Node curr=head;
            while(curr!=null)
            {
                System.out.print(head.data+"->");
                curr=curr.next;
            }
            System.out.print("Null");
        }
    }
    public static void main(String[] args) {

        Abc a=new Abc();
        a.addElement(10);
        a.addElement(10);
        a.print();

    }
}
