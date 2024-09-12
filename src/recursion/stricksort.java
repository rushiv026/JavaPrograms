package recursion;

public class stricksort {
    public static boolean printsor(int a[],int index)
    {
        if(index==a.length-1)
        {
            return true;
        }
        if(a[index]<a[index+1])
        {
            return printsor(a,index+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4};
        System.out.println(printsor(arr,0));

    }
}
