package multi;

class de extends Thread
{
    @Override
    public void run() {
        System.out.println("hello");
    }
}
public class demandex {

    public static void main(String[] args) {

        System.out.println("hey ");
        de d=new de();
        d.setDaemon(true);
        d.start();
    }
}
