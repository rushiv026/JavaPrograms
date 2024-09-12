package collectionframework;
import  java.util.ArrayList;
import java.util.Collections;
public class Demoarraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int size=list.size();
        System.out.println(list);
        System.out.println(size);
        list.add(1,44);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
      list.remove(1);
        System.out.println(list);

    }
}
