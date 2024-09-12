package leet;

public class obdemo {
    obdemo()
    {
        System.out.println("hello");
    }
    public void studentMethod()
    {
        print(this);
        System.out.println("wel come");
    }
    public void print(obdemo o)
    {
        System.out.println("Well Done");
    }

    public static void main(String[] args) {
        obdemo d=new obdemo();
        d.studentMethod();

    }
}
