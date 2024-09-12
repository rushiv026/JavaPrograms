package mm.strings1;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter email");
        String a=s.nextLine();
        String username="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='@')
            {
                break;
            }
            else {
                username+=a.charAt(i);
            }

        }
        System.out.println(username);

    }
}
