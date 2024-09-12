package DEMOJAVA;
class bullet1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<40){
        System.out.println("this is one 1111");
        i++;
        }
    }
}
class bullet2 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<40){
        System.out.println("this is two 2222");
        i++;
        }
    }
}

public class runmulti {
    public static void main(String[] args) {
        bullet1 b=new bullet1();

        bullet2 b1=new bullet2();
        Thread g=new Thread(b);
        Thread g1=new Thread(b1);
        g.start();
        g1.start();

    }
}
