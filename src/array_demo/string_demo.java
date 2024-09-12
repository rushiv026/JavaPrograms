package array_demo;

import java.util.Scanner;

public class string_demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        String [] name=new String[size];
        System.out.println("enter the element:");
        for(int i=0;i<size;i++)
        {
            name[i]=sc.next();
        }

        for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]);
        }


    }
}
