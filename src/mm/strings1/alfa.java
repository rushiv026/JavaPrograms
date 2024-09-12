package mm.strings1;

import java.util.Scanner;

public class alfa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String a=sc.nextLine();
        String result="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='i')
            {
                result+='e';
            }
            else
            {
                result+=a.charAt(i);
            }
        }
        System.out.println(result);
    }
}
