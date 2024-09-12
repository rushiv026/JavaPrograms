package collectionframework;
import java.util.*;

class Demolinkedlist
{
    public static void rev(LinkedList list,int inx)
    {
        if(inx==0)
        {
            System.out.print(list.get(inx)+"->");
            return;
        }
        System.out.print(list.get(inx)+"->");

        rev(list,inx-1);

    }
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println(l);
        l.addLast(99);
        l.addFirst(11);
        System.out.println(l);

        l.removeFirst();
        l.remove();
        System.out.println(l);
        l.remove();
        System.out.println(l);
        System.out.println(l.contains(1));
        System.out.println(l.size());
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+"->");
        }
        System.out.println("NULL");

       rev(l,l.size()-1);
        System.out.println("NULL");





    }
}