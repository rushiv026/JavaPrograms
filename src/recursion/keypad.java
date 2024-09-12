package recursion;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class keypad {
    public static String[] a={".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void key_demo(String str,int index,String combination)
    {
        if(index==str.length())
        {
            System.out.println(combination);
            return;
        }
        char s=str.charAt(index);
        String v=a[s-'0'];
       System.out.println(v.length());

        for(int i=0;i<v.length();i++)
        {
            key_demo(str,index+1,combination+v.charAt(i));
        }

    }
    public static void main(String[] args) {

        String str="23";
        key_demo(str,0,"");

    }
}
