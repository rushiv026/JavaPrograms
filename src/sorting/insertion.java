package sorting;

public class insertion {
    public static void demo_print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        int[] a={20,10,1,5,3,2,4,6,7,8,6,4};
        for(int i=0;i<a.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[smallest]>a[j])
                {
                    smallest=j;
                }
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }

        demo_print(a);
    }
}
