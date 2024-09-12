package function_demo;

import java.util.Scanner;

public class ex1 {

    public static int avg(int a,int b,int c)
    {
        int d=(a+b+c)/3;
        return d;

    }
    public static void oddsum(int a)
    {
        int b=0;
        for(int i=0;i<=a;i++)
        {
            if(i%2!=0)
            {
               b+=i;
            }
            System.out.println("sum od odd number"+b);
        }
    }
  public static void greatest(int a, int b)
  {
      if(a>b)
      {
          System.out.println("number 1st is graeter and this number is "+a);

      }
      else {
          System.out.println("number 2st is graeter and this number is "+b);


      }
  }
  public static void circle(int r)
  {
      double c=(2*3.14*r);
      System.out.println("circumferece of circle "+c);
  }

  public static void vote(int a)
  {
      if(a>=18)
      {
          System.out.println("person eligible in vote");
      }
      else {
          System.out.println("not eligible");
      }
  }

  public static void power(int x,int n)
  {
   int pow=1;
   for(int i=1;i<=n;i++)
   {
      pow *=x;
   }
      System.out.println("power is"+pow);
  }





    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        power(a,b);


    }
}
