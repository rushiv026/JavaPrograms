package multi;

public class demoyeild implements Runnable{

    @Override
    public void run() {
        Thread.yield();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {

        demoyeild d=new demoyeild();
        Thread t=new Thread(d);
        t.start();
      //  Thread.yield();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);

        }

    }
}
