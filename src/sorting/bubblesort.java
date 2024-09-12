package sorting;

public class bubblesort {
    public static void main(String[] args) {
        int[] a={7,8,3,1,2,20,2,4,456,3,23,123};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }

        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(+a[i]+" ");
        }
    }
}
