package recursion;

public class occarance {
    public static int f=-1;
    public static int e=-1;
    public static void demo_occarance(String str,int index,int first_occarance,int last_occarance)
    {
        if(index==str.length())
        {
            System.out.println(first_occarance);
            System.out.println(last_occarance);
            return;
        }
        char a=str.charAt(index);
        if(a=='a')
        {
            if(first_occarance==-1) {
                first_occarance = index;
            }
            else
            {
                last_occarance=index;
            }

        }
        demo_occarance(str,index+1,first_occarance,last_occarance);
    }

    public static void main(String[] args) {
        String a="ajknnabknkbabba";
        demo_occarance(a,0,e,f);
    }
}
