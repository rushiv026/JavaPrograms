package oops;

class Fun
{
    private String pass;
    public String getPass()
    {
        return pass;
    }
    public void setPass(String pass)
    {
        this.pass=pass;
    }
}
public class demo1 {

    public static void main(String[] args) {
      Fun f=new Fun();
    f.setPass("abcg");
        System.out.println(f.getPass());
    }

}
