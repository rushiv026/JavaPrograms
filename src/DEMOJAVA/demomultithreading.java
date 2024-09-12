package DEMOJAVA;

class demo1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println("good morning friends");
        i++;
        }
    }
}
class demo2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<5) {
            System.out.println("good afternoon friends");
            i++;
        }
    }
}
public class demomultithreading
{
    public static void main(String[] args)
    {
        demo1 d1=new demo1();
        demo2 d2=new demo2();
        d1.start();

        d2.start();

    }
}
