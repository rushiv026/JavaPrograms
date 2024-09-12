package oops;
import static oops.man.*;
//single inheri
//class parent{
//  void one()
//  {
//      System.out.println("parent");
//  }
//}
//class child extends parent
//{
//    void one1()
//    {
//        System.out.println("child class");
//    }
//
//}
//multilevel inheri

class parent{
  void one()
  {
      System.out.println("parent");
  }
}
class child extends parent {
    void one1() {
        System.out.println("child class");
        System.out.println(name);
    }

}
class childschild extends child{

    void demo()
    {
        System.out.println("third child");
    }
}
public class Inheritancedemo {
    public static void main(String[] args) {
        childschild c=new childschild();
        c.one();
        c.one1();
        c.demo();
    }
}
