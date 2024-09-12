package bitmanipulation;

public class position {
    public static void main(String args[])
    {
        int n=10;//1010
        int pos=3;
        int bitpack=1<<pos;//0001<<3==1000
        if((bitpack & n)==0)//1000 & 1010
        {
            System.out.println("bit zero");
        }
        else
        {
            System.out.println("one bit");
        }
    }
}
