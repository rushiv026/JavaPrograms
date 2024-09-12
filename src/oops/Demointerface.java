package oops;

import java.lang.invoke.StringConcatFactory;

interface behaviour
{
    void run();
    abstract String eat();
    abstract String walk();
    abstract void sleep();

}
interface other
{
    abstract void seen();
    void speak();

}
class man implements behaviour,other
{
    public static int cool=10;
    protected static String name="Rushi";
    @Override
    public void seen() {
        System.out.println("seen");
    }

    @Override
    public void speak() {
        System.out.println("man speaking");
    }

    @Override
    public void run() {
        System.out.println("man run");
    }
    public void sleep()
    {
        System.out.println("man sleep");
    }

    @Override
    public String walk() {
        return "man walk";
    }

    @Override
    public String eat() {
        return "eat";
    }
}
public class Demointerface {
    public static void main(String[] args) {
        man b=new man();
        b.seen();b.sleep();b.eat();b.run();b.speak();
        System.out.println(b.walk());
        System.out.println(b.eat());
    }
}
