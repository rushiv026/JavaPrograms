package DEMOJAVA;
class google extends Thread
{
    public void run()
    {
        int i=1;
        int f=1;
        while(i<6)
        {
            System.out.println(f*=i);
            i++;
        }
    }

}
class google2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<20)
        {
            System.out.println("second");
            i++;
        }

    }
}
public class somemethodthread {
    public static void main(String[] args) {
        google g=new google();
        google2 g1=new google2();
        g.start();
       try
       {
           g.join();
           int a=10;
           int b=39;
           int c=a+b;
           System.out.println(c);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        g1.start();
    }
}
