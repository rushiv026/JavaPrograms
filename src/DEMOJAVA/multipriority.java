package DEMOJAVA;
import java.lang.*;
class myname extends Thread
 {
     public myname(String name)
     {
         super(name);

     }
     public void run()
     {
         int i=0;
         while(i<5){
             System.out.println("Thread name"+ this.getName());
             i++;
         }
     }
 }
public class multipriority {
    public static void main(String[] args) {
        myname m5=new myname("rushikesh");
        myname m6=new myname("mangesh");
        myname m7=new myname("mahesh");
        myname m8=new myname("kamlesh");
        myname m9=new myname("suarav");
        m5.setPriority(Thread.MAX_PRIORITY);
        m9.setPriority(Thread.NORM_PRIORITY);
        m6.setPriority(Thread.MIN_PRIORITY);
        m5.start();
        m6.start();
        m7.start();
        m8.start();
        m9.start();

    }
}
