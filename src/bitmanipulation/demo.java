package bitmanipulation;

public class demo {
    public static void main(String[] args) {
        //get Bit
        int n=100;//1100
        int pos=2;//finding  second possition
        int bitmask=1<<pos;//0001<<2==0100
        if((bitmask & n)==0)
        {
            System.out.println("bit zero");
        }
        else {
            System.out.println("bit is one");
        }
    }
}
