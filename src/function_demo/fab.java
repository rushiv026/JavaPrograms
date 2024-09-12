package function_demo;

import java.util.Scanner;

public class fab {
     public static void Fib(int a, int b,int n)
     {

         for(int i=0;i<n;i++)
         {


             int c=a+b;
             System.out.println(a);
             a=b;
             b=c;
         }
     }

    public static void main(String[] args) {
        Fib(0,1,9);
    }

}
