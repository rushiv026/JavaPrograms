package multi;

public class demosleep
{
    public static void main(String[] args) throws InterruptedException
    {
        for(int i=0;i<5;i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }
        for(int i=6;i<10;i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }

    }
}
