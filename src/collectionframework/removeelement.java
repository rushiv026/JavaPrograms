package collectionframework;
//Q1)find and delete the nth node from the end of linked list
//Q2)check if linked list is palindrome
//Q3)detect a cycle in a linked list + trick to remove the cycle
public class removeelement {
    Node head;
    class Node
    {
        int element;
        Node next;
        Node(int element)
        {
            this.element=element;
            this.next=null;

        }
    }

    public void addfirst(int element)
    {
        Node node=new Node(element);
        if(head==null)
        {
            head=node;
            return;
        }
        head=node;
    }
    public void addlast(int element)
    {
        Node node=new Node(element);
        if(head==null)
        {
            head=node;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;


        }
        current.next=node;
    }
public void printlist()
{
    if(head==null)
    {
        System.out.println("empty");
        return;
    }
    Node current=head;
    while (current!=null)
    {
        System.out.print(current.element+"->");
        current=current.next;
    }
    System.out.println("null");
}

public void deleteee()
{

    int size=0;
    int n=4;
    Node current=head;
    while (current.next!=null)
    {
        size++;
        current=current.next;
    }
    System.out.println(size);
    int cutnodeprev=size-n+1;
    System.out.println(cutnodeprev);
    ////delete 4rd=4 element of the list and print
    int i=0;
    int count=0;
    Node current1=head;
    while (i<cutnodeprev)
    {
        count++;
        current1=current1.next;
        i++;
    }
    System.out.println(count);
    current1.next=current1.next.next;
    printlist();
    System.out.println(palindromecheck());
}
public Node findmmidle(Node head)
{
    Node fast=head;
    Node slow=head;
    while(fast.next!=null && fast.next.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
}
public Node rev(Node head)
{
    Node prev=null;
    Node current=head;
    while (current!=null)
    {
        Node nextnode=current.next;
        current.next=prev;
        prev=current;
        current=nextnode;
    }
    return prev;
}
public Boolean palindromecheck()
{
    if(head==null ||head.next==null)
    {
        return false;
    }

    Node middle=findmmidle(head);
    Node secondstart=rev(middle.next);
    while (secondstart!=null) {
        if (head.element == secondstart.element) {
            head = head.next;
            secondstart = secondstart.next;
        }
        else {
            return false;
        }
    }
    return true;

}
public Boolean pali()
{
    if(head==null || head.next==null)
    {
        return false;
    }
    Node middle=findmmidle(head);
    Node rev=rev(middle.next);
    while (rev!=null)
    {
        if(rev.element==head.element)
        {
            rev=rev.next;
            head=head.next;
        }
        else{
            return false;
        }
    }

    return true;
}
    public static void main(String[] args) {
        removeelement r=new removeelement();
        r.addfirst(1);

        r.addlast(2);
        r.addlast(3);
        r.addlast(3);
        r.addlast(4);
        r.addlast(2);
        r.addlast(1);
        r.printlist();
        //r.addlast(4);
       // r.addlast(5);
        //System.out.println(r.palindromecheck());

       r.deleteee();


    }
}
