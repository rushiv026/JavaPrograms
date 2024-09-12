package leet;

public class pa {

    public static void main(String[] args) {
        int n=765;
        int n1=n;
        int temp=0,r;
        while(n>0)
        {
            r=n%10;
            temp=temp*10+r;
            n=n/10;
        }
        System.out.println(temp);
    }
}
