package DEMOJAVA;
class my extends Thread
{
    public my(String name)

    {
        super(name);
    }
    public void run()
    {
        System.out.println("this is my thread programming use constructors");
    }
}

public class multiconstractor {
    public static void main(String[] args) {
        my m=new my("rushi");
        my m1=new my("fun");
        m.start();
        System.out.println("thread name"+m.getName() +"\nthread id"+m.getId());
        System.out.println("thread name"+m1.getName() +"\nthread id"+m1.getId());

    }
}
