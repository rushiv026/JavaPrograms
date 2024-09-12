package leet;

import java.util.Scanner;

public class sr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("enter number");
        String start1=sc.next();
        String last2=sc.next();
        int start=0,last=0;
        for(int i=0;i<name.length();i++)
        {
            char a=start1.charAt(0);
            char b=last2.charAt(0);
            if(name.charAt(i)==a )
            {
                start+=i;

            }
            if(name.charAt(i)==b)
            {
                last+=i;
                break;

            }
        }
        System.out.println(start+"\t"+last);


      for(int i=0;i<name.length();i++)
      {
          if(i==start)
          {
              for(int j=start;j<=last;j++)
              {
                  i++;
              }

          }
          System.out.println(name.charAt(i));
      }


    }
}
