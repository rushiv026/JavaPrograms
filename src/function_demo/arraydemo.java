package function_demo;
import java.util.Scanner;
public class arraydemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter how many size of array");
        int arr_size=sc.nextInt();
        System.out.println("Enter Aray Element:");
        int[] a=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                System.out.println("number is positive");
            }
            else if(a[i]==0)
            {
                System.out.println("number is zero");
            }
            else
            {
                System.out.println("number is negative");
            }
        }
    }
}
