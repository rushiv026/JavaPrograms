package array_demo;

import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        System.out.println("enter element:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();

        }

        System.out.println("spiral");
        int rowstart=0;
        int rowend=2;
        int colstart=0;
        int colend=2;
        while(rowstart<rowend && colstart<colend)
        {
            for(int col=colstart;col<=colend;col++)
            {
                System.out.print(a[rowstart][col]);
            }

          rowstart++;
            for(int row=rowstart;row<=rowend;row++)
            {
                System.out.print(a[row][colend]);
            }
            colend--;
            for(int col=colend;col>=colstart;col--)
            {
                System.out.print(a[rowend][col]);
            }
            rowend--;

                System.out.print(a[rowend][colstart]);
                colstart++;

        }


    }
}
