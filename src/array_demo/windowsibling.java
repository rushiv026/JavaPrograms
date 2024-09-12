package array_demo;

public class windowsibling {
    public static void maxsum(int a[],int k) {

        int maxsum = Integer.MIN_VALUE;
        for (int i=0;i<a.length-1-k+1;i++)
        {
            int current=0;
            for(int j=0;j<k;j++)
            {
                current=current+a[i+j];
            }
            maxsum=Math.max(maxsum,current);
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int a[]={1,2,4,46,7,8,34};
        windowsibling w=new windowsibling();
        int k=3;
        w.maxsum(a,k);

    }
}
