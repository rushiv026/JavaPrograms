package recursion;

public class fabnumber
{
    public static void fab(int a,int b,int n) {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        fab(b,c,n-1);


    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        System.out.println(a);
        System.out.println(b);
        fab(a,b,n);



    }
}
