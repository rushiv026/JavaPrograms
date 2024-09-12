package multi;

//join main method;
public class demo1jion extends Thread{


    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }

    catch(Exception e)
            {
                System.out.println(e);
            }
        }
    public static void main(String[] args) {

        demo1jion j=new demo1jion();
        j.start();
        try
        {
            j.join();
            for(int i=0;i<5;i++)
            {
                System.out.println("main thread:"+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
