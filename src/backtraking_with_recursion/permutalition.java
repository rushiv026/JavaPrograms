package backtraking_with_recursion;

public class permutalition {
    public static void permu(String str,String permutation)
    {
        if(str.length()==0)
        {
            System.out.println("premutation:"+permutation);
            return;
        }
        for(int i=0;i<str.length();i++)
        {

            char current=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            System.out.println("substring:"+i+"/t"+newstr);
            permu(newstr,permutation+current);

        }
    }
    public static void main(String[] args) {
       String a="abc";
       permu(a,"");
    }
}

