package multi;
class spp implements Runnable
{
    public void run()
    {
        try {

            for (int i = 10; i < 15; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class demosleep2 extends Thread {

    @Override
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(3000);
                System.out.println(i);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {

        demosleep2 d1=new demosleep2();
        d1.start();

        demosleep2 d2=new demosleep2();
        d2.start();

        spp s=new spp();
        Thread t=new Thread(s);
        t.start();

    }
}
