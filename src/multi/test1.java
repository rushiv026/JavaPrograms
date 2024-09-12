package multi;

class demo extends Thread
{
    public void run()
    {
        System.out.println("process start");
    }


}
class demo2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("fun");
    }
}
class demo3 implements Runnable
{

    @Override
    public void run() {
        System.out.println("second runnable");
    }
}
public class test1 {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("rushi");
//        System.out.println(Thread.currentThread().getName());

      demo2 demo=new demo2();
      Thread t=new Thread(demo);
      t.start();
        System.out.println(Thread.currentThread().isAlive());
      System.out.println(t.isAlive());
//        demo demo1=new demo();
//        demo1.start();
//        demo demo2=new demo();
//        demo2.start();


//        demo2 d=new demo2();
//        Thread t=new Thread(d);
//        t.start();
//        demo3 d3=new demo3();
//        Thread t3 =new Thread(d3);
//        t3.start();

    }
}
