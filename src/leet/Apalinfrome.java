package leet;

public class Apalinfrome {

    public static void main(String[] args) {
        int[] a={33,151,121,34};
        for(int i=0;i<a.length;i++)
        {

            int r,sum=0,n;
            n=a[i];
            while (n>0)
            {
                r=n%10;
                sum=sum*10+r;
                n=n/10;
            }

            if(sum==a[i])
            {
                System.out.println(a[i]+"number is palindrome");
            }
            else
            {
                System.out.println(a[i]+"number is not palindrome");
            }
        }
    }
}
