package recursion;

public class styleplace {
   public static int place(int n,int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        int vertical=place(n-1,m);
        int horzontal=place(n-m,m);
    return vertical+horzontal;
    }
    int a=place(3,3);
    public static void main(String[] args) {
        int n=4,m=2;

        System.out.println(place(n,m));

    }
}

