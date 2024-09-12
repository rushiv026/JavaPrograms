package array_demo;

import java.util.Scanner;

public class twoaray {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter n and m:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] name=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                name[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                    System.out.print(name[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(name[i][j]==2)
                {
                    System.out.println(i+" "+j);
                }
            }

        }


    }
}
