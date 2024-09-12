package array_demo;

public class binaryserch {
    public int binary(int a[],int find,int s,int e)
    { int mid=s+(e-s)/2;

        if(a[mid]==find)
        {
            return mid;
        }
        if(a[mid]>find)
        {
          return binary(a,4,0,mid-1);
        }
        else
        {
           return binary(a,4,mid+1,e);
        }


    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int s=0;
        int e=a.length-1;


        binaryserch b=new binaryserch();
        System.out.println( b.binary(a,4,0,8));
    }
}
