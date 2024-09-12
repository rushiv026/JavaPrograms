package leet;

import java.util.Scanner;

public class smart
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"sun","mon","tue","wed","thus","fri","sat"};
        int price[]=new int[7];
        for(int i=0;i<arr.length;i++)
        {
            price[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+":"+price[i]);
        }
    }
}
