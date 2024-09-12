package bitmanipulation;

public class clear {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitpack=1<<pos;
        int notbit=~(bitpack);
        System.out.println(notbit);
        int newbit=notbit & n;
        System.out.println(newbit);
    }
}
