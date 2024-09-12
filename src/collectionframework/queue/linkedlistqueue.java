package collectionframework.queue;

public class linkedlistqueue {

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
    static class queue
    {
        public static Node head=null;
        public static Node tail=null;

        public static boolean isEmpty()
        {
            return head==null & tail==null;
        }
        public static void add(int data)
        {
            Node newnode=new Node(data);
            if(tail==null)
            {
                head=newnode;
                tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static void remove()
        {
            if(isEmpty())
            {
                System.out.println("empty");
                return ;
            }
            int data=head.data;
            if(head==tail)
            {
                tail=null;
            }

            head=head.next;
            System.out.println(data);
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty");
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
