package recursion;

import java.util.HashSet;

public class demo_substring {
public static void sub(String s,int index,String newstring,HashSet<String> set)
{
    if(index==s.length())
    {
        if(set.contains(newstring))
        {
            return;
        }
        else {
            System.out.println(newstring);
            set.add(newstring);

            return;
        }
    }
    char cu=s.charAt(index);
    //to be
    sub(s,index+1,newstring+cu,set);
    //System.out.println("n="+newstring);
    //not be
    sub(s,index+1,newstring,set);
    //System.out.println("m="+newstring);
}
    public static void main(String[] args) {
        String s="aaa";

        //unique subsequence
        HashSet<String> set=new HashSet<>();
        sub(s,0,"",set);
    }
}
