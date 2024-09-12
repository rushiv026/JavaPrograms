package sorting;

public class mergesort {
    public static void concor(int a[],int s,int mid,int e)
    {
        int[] newarr=new int[e-s+1];
        int id1=s;
        int id2=mid+1;
        int x=0;
        while (id1<=mid && id2<=e)
        {
            if(a[id1]<=a[id2])
            {
                newarr[x]=a[id1];
                x++;id1++;
            }
            else {
                newarr[x]=a[id2];
                x++;id2++;
            }
        }
        while (id1<=mid)
        {
            newarr[x]=a[id1];
            x++;id1++;
        }
        while (id2<=e)
        {
            newarr[x]=a[id2];
            x++;id2++;
        }
        for(int i=0,j=s;i<newarr.length;i++,j++)
        {
            a[j]=newarr[i];
        }
    }
    public static void mergesortdemo(int a[],int s,int e)
    {
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;

        mergesortdemo(a,s,mid);
        mergesortdemo(a,mid+1,e);

        concor(a,s,mid,e);
    }
    public static void main(String[] args) {
        int[] a={39,12,18,85,72,10,2,18};
        int st=0;
        int e=a.length;
        System.out.println(e);
        mergesortdemo(a,st,e-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}