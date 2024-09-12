package string_bilder;

import java.util.Scanner;

public class reverce {
    public static void main(String[] args) {
        Scanner ad=new Scanner(System.in);
        System.out.println("enter only string");
        String a=ad.nextLine();
        StringBuilder sb=new StringBuilder(a);
        for(int i=0;i<sb.length()/2;i++)
        {
            int s=i;
            int e=sb.length()-1-i;
            char schar=sb.charAt(s);
            char echar=sb.charAt(e);
            sb.setCharAt(s,echar);
            sb.setCharAt(e,schar);
        }
        System.out.println(sb);
    }
}
