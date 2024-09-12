package array_demo;

import java.util.Scanner;

public class demo {

    public static void main(String args[]) {


        int[] marks = new int[5];
  Scanner sc=new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
              marks[i]=sc.nextInt();
        }

        System.out.println("printing array");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
            if(marks[i]==40) {
                System.out.println(i);
            }
        }
    }
}