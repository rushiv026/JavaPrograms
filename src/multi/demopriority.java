package multi;

public class demopriority extends Thread{

    public void run()
    {
        System.out.println("Child thread priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("child");
        System.out.println("child thread new priority:"+Thread.currentThread().getPriority());

    }
    public static void main(String[] args) {
        System.out.println("main thread old priority:"+Thread.currentThread().getPriority());
        System.out.println("hello");
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("main thread change priority"+Thread.currentThread().getPriority());

        demopriority d=new demopriority();
        d.start();

    }

}
