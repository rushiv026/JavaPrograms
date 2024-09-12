package bitmanipulation;

import javax.swing.*;
import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter update bit 0/1");
        int a=sc.nextInt();
        int num=5;
        switch (a)
        {
            case 0:
                int pos=0;
                int bitmask=1<<pos;
                System.out.println(bitmask);
                int component=~(bitmask);
                System.out.println(component);
                int result=num & component;
                System.out.println(result);
                break;
            case 1:
                int pos1=1;
                int bitmask1=1<<pos1;
                int result1=num | bitmask1;
                System.out.println(result1);
                break;
            case 3:
                int pos2=1;
                int bitmask2=1<<pos2;
                if((num & bitmask2)==0)
                {
                    System.out.println("bit is zero");
                }
                else {
                    System.out.println("bit is one");
                }

                break;


            default:
                System.out.println("invalid");

        }

    }
}
