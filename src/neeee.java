import java.util.Scanner;


public class neeee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter mark");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
          if(max<arr[i])
          {
              max=arr[i];
          }
          sum+=arr[i];

        }
        float avg=sum/n;
        System.out.println("sum of marks"+sum+"\n"+"percentage:"+avg);
        System.out.println("maximum:"+max);
    }
}
