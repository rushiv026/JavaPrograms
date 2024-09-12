package array_demo;

import java.util.ArrayList;

public class topointer {
    public static void tocheck(ArrayList<Integer> a,int x)
    {
        int i=0;
        int size=a.size()-1;
        while (i<size)
        {
            if(a.get(i)+a.get(size)==x)
            {
                System.out.println(a.get(i)+"+"+a.get(size)+"="+x);
                break;
            }
            else if(a.get(i)+a.get(size)<x)
            {
                i++;
            }
            else
            {
                size--;
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        int find=8;
        topointer t=new topointer();
        t.tocheck(a,find);

    }
}
