package bitmanipulation;

public class setbit {

    public static void main(String[] args) {
   int n=7;//0111
   int pos =3;
   int bitpack=1<<pos;//0001<<3==1000
        int newbit=(bitpack | n);//1000 OR 0111
        System.out.println(newbit);
    }
}
