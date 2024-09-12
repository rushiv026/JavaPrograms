package function_demo;
import java.util.*;
public class add
{
    public static int addnumber(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static int mul(int a,int b)
    {
        int c=a*b;
        return c;
    }
    public static int fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st and 2nd number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("addition two number"+addnumber(num1,num2));
        System.out.println("multiplication two number is"+mul(num1,num2));
        System.out.println("factorial of this number is" +fact(num1));
    }
}
