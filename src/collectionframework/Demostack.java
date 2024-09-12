package collectionframework;

import java.util.ArrayList;

//using linkedlist
public class Demostack {

//  static class Node
//   {
//       int num;
//       Node next;
//       Node(int num)
//       {
//           this.num=num;
//           this.next=null;
//
//       }
//   }
//   static class Stack
//   {
//      static Node head;
//       public void push(int num)
//       {
//           Node n=new Node(num);
//           if(head==null)
//           {
//               head=n;
//           }
//           n.next=head;
//           head=n;
//       }
//       public void pop()
//       {
//           if(head==null)
//           {
//               return ;
//           }
//           int top=head.num;
//           head=head.next;
//           System.out.println(top);
//
//       }
//       public void seek()
//       {
//           if(head==null)
//           {
//               return ;
//           }
//           System.out.println(head.num);
//
//       }
//
//   }
///using Arraylist
    static class Stack
{
   static ArrayList<Integer> l=new ArrayList<>();
   public static void push(int num)
   {
       l.add(num);
   }
   public static void pop()
   {
       if(l.size()==0)
       {
           System.out.println("empty");
           return;
       }
       l.remove(l.size()-1);
       //System.out.println(pop);
   }
   public static void seek()
   {
       if(l.size()==0)
       {
           System.out.println("empty");
           return;
       }
       System.out.println(l.get(l.size()-1));
   }
}
    public static void main(String[] args) {
      Stack d=new Stack();
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        d.seek();
        d.pop();
        d.seek();
        d.pop();
        d.seek();
        d.pop();



    }
}
