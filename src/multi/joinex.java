package multi;

class Medical extends Thread
{
    public void run() {
        try {

            System.out.println("medical start");
            Thread.sleep(3000);
            System.out.println("medical is done stat the next step");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
class Ground extends Thread
{

    Medical m=new Medical();

    @Override
    public void run() {
        try
        {
            m.start();
            m.join();
            System.out.println("ground are started");
            Thread.sleep(3000);
            System.out.println("ground complete");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class joinex {


    public static void main(String[] args) {

        Ground g=new Ground();
        g.start();
        try
        {

            g.join();
            Thread.sleep(2000);
            System.out.println("main officer signature ok");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
