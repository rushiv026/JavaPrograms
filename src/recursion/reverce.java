package recursion;

public class reverce {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder("rushikesh vyavahare");
//        //System.out.println(sb.length());
//        String d="";
//        char v=sb.charAt(0);
//        for(int i=0;i<sb.length();i++) {
//           // System.out.println(sb.length());
//            String b = sb.substring(sb.length() - 1, sb.length());
//            sb.delete(sb.length() - 1, sb.length());
//            //System.out.println(sb);
//            d=d+b;
//            i=0;
//        }
//        System.out.println(d+v);
          int a=12349098;
          int rev=0;
          while(a>0)
          {
              int temp=a%10;
              rev=rev*10+temp;
              a=a/10;
          }
        System.out.println(rev);


    }

}
