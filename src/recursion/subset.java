package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subset {
    public static void printsum(ArrayList<Integer> sub)
    {
        for(int i=0;i<=sub.size()-1;i++)
        {
            System.out.print(sub.get(i)+" ");
        }
        System.out.println();
    }
    public static void subdemo(int n, ArrayList<Integer> sub)

    {
        if(n==0)
        {
            printsum(sub);
            return;
        }
        //add element in arraylist
       sub.add(n);
       subdemo(n-1,sub);

       //remove element arraylist
        sub.remove(sub.size()-1);
        subdemo(n-1,sub);


    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> sub=new ArrayList<>();
        subdemo(n,sub);

    }
}
