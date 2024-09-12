package recursion;

public class countpath {
    public static int printpath(int i,int j,int n,int m)
    {
        if(i==n ||j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }

        int down=printpath(i+1,j,n,m);
        int right=printpath(i,j+1,n,m);
        return down+right;
    }

    public static void main(String[] args) {
        int total = printpath(0, 0, 3, 4);
        System.out.println(total);
    }
}
