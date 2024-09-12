package recursion;

public class hanoi
{
    public static void honio_demo(int n,String source,String helper,String destinatio)
    {
        if(n==1)
        {
            System.out.println("tranfer disk "+n+" from "+source+" to "+destinatio);
            return;
        }
        honio_demo(n-1,source,destinatio,helper);
        System.out.println("tranfer disk "+n+" from "+source+" to "+destinatio);
        honio_demo(n-1,helper,source,destinatio);

    }

    public static void main(String[] args) {
        int n=3;
        honio_demo(n,"s","h","d");
    }
}
