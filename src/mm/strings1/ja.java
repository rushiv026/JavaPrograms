package mm.strings1;

import java.util.Scanner;

public class ja {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter char");
        String a=sc.nextLine();
        String total="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a' | a.charAt(i)=='e'| a.charAt(i)=='i'| a.charAt(i)=='o'| a.charAt(i)=='u')
            {
              total+=a.charAt(i);
            }
        }
        System.out.println(total);
    }
}
