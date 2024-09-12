package array_demo;

import java.util.Scanner;

public class asendingarray
{
    public static void main(String[] args) {
        int price[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter price:");
        for(int i=0;i<5;i++)
        {
            price[i]=sc.nextInt();
        }
        boolean asending=true;

        for(int i=0;i<price.length-1;i++)
        {
            if(price[i] >price[i+1])
            {
                asending=false;
            }
        }
        if(asending)
        {
            System.out.println("array is ascending order");
        }
        else {
            System.out.println("array not ascending order");
        }
    }
}
