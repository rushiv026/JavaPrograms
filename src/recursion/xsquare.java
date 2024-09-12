package recursion;

public class xsquare {
    public static void sum_demo(int x,int n)
    {
        if(n==1)
        {
            System.out.println(x);
            return;
        }
        x*=2;

        sum_demo(x,n-1);

    }
    public static void main(String[] args) {
       int x=2;
       int n=5;
       sum_demo(x,n);
    }
}
