package recursion;

public class natural {
    public static  void demosum(int n,int sum)
    {
        if(n==5)
        {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=n;

        demosum(n+1,sum);


    }
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        demosum(n,sum);
    }
}
