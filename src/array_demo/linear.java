package array_demo;

public class linear {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        boolean b=false;
        for (int i=0;i<a.length-1;i++)
        {
            if(a[i]==10)
            {
              b=true;
            }
            else {
                b=false;
            }
        }
        if(b==true)
        {
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
}
