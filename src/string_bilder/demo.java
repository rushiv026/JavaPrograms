package string_bilder;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String a=sc.nextLine();
        StringBuilder sb=new StringBuilder(a);
        System.out.println(sb.charAt(2));
        sb.setCharAt(2,'S');
        System.out.println(sb);
        sb.insert(5,"kesh");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append(" vyavahare");
        System.out.println(sb);
        sb.delete(10,sb.length());
        System.out.println(sb);


    }
}
