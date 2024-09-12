package multi;

public class demojoin2 extends Thread{
static Thread m;

    @Override
    public void run() {
        try
        {
            m.join();
            for(int i=0;i<5;i++)
            {
                System.out.println("child:"+i);
                Thread.sleep(1000);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        m=Thread.currentThread();
        demojoin2 b=new demojoin2();
        b.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main:" + i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
}
