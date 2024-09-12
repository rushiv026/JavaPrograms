package mm.strings1;

public class compare_strings {
    public static void main(String[] args) {
        String a="rushi";
        String b="rushi";
        if(a==b)
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("not same");
        }
        if(a.compareTo(b)==0)
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("not same");
        }
        if(a.equals(b))
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("not same");
        }


    }
}
