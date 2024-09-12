package collectionframework;

public class demolink {
  Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(String data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void addlast(String data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=node;

    }
    public void printa()
    {
        if(head==null)
        {
            System.out.println("empty");
        }
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public void firstdelete()
    {
        if(head==null)
        {
            System.out.println("list empty");
            return;
        }
        head=head.next;
    }

    public void lastdelete()
    {
        if(head==null)
        {
            System.out.println("list empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            System.out.println("eee");
            return;
        }
        Node last=head.next;
        Node secondlast=head;
        while (last.next!=null)
        {
            last=last.next;
            secondlast=secondlast.next;
        }
        last=null;
        secondlast.next=null;
    }
    public void size()
    {
        int size=0;
        Node current=head;
        while (current!=null)
        {
            size++;
            current=current.next;
        }
        System.out.println(size);
    }
//using iteration
    public void reverseireration()
    {
        if(head==null ||head.next==null)
        {
           return;
        }
        Node prev=head;
        Node current=head.next;
        while (current!=null)
        {
            Node nextnode=current.next;

            current.next=prev;

            //
            prev=current;
            current=nextnode;
        }
        head.next=null;
        head=prev;

    }
    public void reverserecurtion()
    {

    }

    public static void main(String[] args) {
        demolink d=new demolink();
        d.addfirst("rushi");
        d.addfirst("vyavahare");
       // d.printa();
        d.size();
        d.addlast("santosh");
        d.addlast("santoshss");
        d.printa();
       // d.size();
      //  d.reverseireration();
      //  d.printa();
      //  d.firstdelete();
      //  d.printa();
        d.lastdelete();
        d.printa();
       // d.lastdelete();
      //  d.printa();

    }
}
