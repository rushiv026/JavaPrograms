package sorting;

public class selectiondemo {
    public static void main(String[] args) {
        int[] a={24,4,232,12,3242,3,5};
        //bubble sort
        for(int j=0;j<a.length;j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        //insertoin sort
//        for(int i=0;i<a.length;i++)
//        {
//            int small=i;
//            for(int j=i+1;j<a.length;j++)
//            {
//                if(a[small]>a[j])
//                {
//                    small=j;
//                }
//            }
//            int temp=a[small];
//            a[small]=a[i];
//            a[i]=temp;
//
//
//        }

        //
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
