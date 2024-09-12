package oops;
//runtime ploymorphism/methed overriding
class shape
{
    void draw()
    {
        System.out.println("draw shape");
    }
}
class rect extends shape
{
    void draw()
    {
        System.out.println("draw rectangle");
    }
}

class square extends shape
{

    void draw() {
        System.out.println("draw square");
    }
}

public class Demoploy {

    public static void main(String[] args) {
        shape s=new rect();
        s.draw();
        s=new square();
        s.draw();
        s=new shape();
        s.draw();

    }
}
