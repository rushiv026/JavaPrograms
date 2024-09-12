package oops;
import oops.Demointerface;

import static oops.man.cool;


abstract class math
{
   public int g;
    abstract void add(int a,int b);
    math()
    {
        System.out.println("hello im abstract constractor");
    }
    public static void m()
    {
        System.out.println("hello im abstract class");
    }
    //declare abstract keyword font of the method name only declaration allow not write any implementation in method body
//unwanted hide to the user.
}
class tall extends math
{
    @Override
    void add(int a, int b) {
        System.out.println(a+b);
        System.out.println(g=50);

        System.out.println(cool);
    }

}
public class Demoabstract {
    public static void main(String[] args) {
        math m=new tall();
        m.add(10,10);
        m.m();

    }
}
