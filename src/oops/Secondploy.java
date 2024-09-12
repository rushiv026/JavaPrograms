package oops;

class demo
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(double a,double b)
    {
        System.out.println(a+b);
    }
    void add(float a,float b)
    {
        System.out.println(a+b);

    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}
public class Secondploy {
    public static void main(String[] args) {


        demo d = new demo();
        d.add(10,20);
        d.add(10.0,29.8);
        d.add(20.88,10.20);
        d.add(2,3,4);
    }
}
