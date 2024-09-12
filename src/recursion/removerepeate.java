package recursion;
public class removerepeate
{
    public static boolean[] a=new boolean[26];
    public static void re(String str,int index,String newstring)
    {
        if(index==str.length())
        {
            System.out.println(newstring);
            return;
        }
        char current=str.charAt(index);
        if(a[current-'a']==true)
        {
            re(str,index+1,newstring);
        }
        else {
            newstring+=current;
            a[current-'a']=true;
            re(str,index+1,newstring);
        }

    }
    public static void main(String[] args) {
        String str="aanna";
        re(str,0,"");

    }
}