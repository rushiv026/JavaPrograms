package function_demo;
import java.util.*;
public class gcd {

    public static void GCD(int a,int b)
    {
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0 )
            {
                gcd=i;
            }
        }
        System.out.println("greatest common division"+gcd);
    }


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        GCD(a,b);
    }
}
