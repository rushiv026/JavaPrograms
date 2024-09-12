package array_demo;

import java.util.Scanner;

public class checkdemo {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("enter element");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean s=false;

        for(int i=0;i<=3;i++)
        {
            if(a[i]+a[i+1]==a[i+2])
            {
                System.out.println(a[i+2]);
                s=true;
            }
        }
      if(!s)
      {
          System.out.println("not match");
      }
      else
      {
          System.out.println("match");
      }
    }
}
