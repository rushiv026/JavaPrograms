package leet;

import java.util.ArrayList;

public class demoq {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        int e=40;
        for(int i=0;i<a.size();i++)
        {
            int g=a.get(i);
            if(g==e)
            {
                continue;
            }
            else
            {
                a.add(e);
            }
        }

    }
}
