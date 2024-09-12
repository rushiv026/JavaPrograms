class First extends Thread
{

    public void run()
    {
        while (true) {
            System.out.println("goood");
            System.out.println("morning");
        }
    }
}
class Second extends Thread
{
    public void run()
    {
        while (true) {
            System.out.println("night");
            System.out.println("sad");
        }
    }
}
class demo1
{
    public static void main(String[] args) {
        First f=new First();
        Second s=new Second();

        f.start();
        s.start();
    }

}