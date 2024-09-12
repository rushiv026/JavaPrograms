package recursion;

public class permutation {
    public static void permutation(String a,int index,String newstring)
    {
        if(a.length()==0)
        {
            System.out.println(newstring);
            return;
        }
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            String p=a.substring(0,i)+a.substring(i+1);
            permutation(p,index+1,newstring+c);
        }
    }
    public static void main(String[] args) {
        String a="ABC";
        permutation(a,0,"");
    }
}
