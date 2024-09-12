package recursion;

public class rev {
    public static void print_rev(String str,int index)
    {
        if(index==0)
        {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        print_rev(str,index-1);
    }
    public static void main(String[] args) {
        String a="abcdefg";
        System.out.println(a);
        print_rev(a,a.length()-1);

    }
}
