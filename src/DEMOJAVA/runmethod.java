package DEMOJAVA;
import java.lang.*;
class nine implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("i");
            try {
                Thread.sleep(300);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
class ten implements Runnable
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("welcome");
        }
    }
}
public class runmethod {
    public static void main(String[] args)
    {
        nine n=new nine();
        ten t=new ten();
        Thread t10=new Thread(n);
        Thread t9=new Thread(t);
        t10.setPriority(Thread.MAX_PRIORITY);
        t10.start();
         try
         {
             t10.join();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        t9.start();


    }
}
