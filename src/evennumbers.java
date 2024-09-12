import java.util.Scanner;

public class evennumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        int sum=0;
        int increment=1;
        int i=0;



//        while(increment<n)
//        {
//            if(increment%2==0)
//            {
//
//                if(increment%3==0)
//                {
//                    sum+=increment;
//                }
//               n1++;
//                if(n1==10)
//                {
//                    break;
//                }
//            }
//            increment++;
//        }

        while(increment<=n)
        {
            if(i%2==0)
            {
                if(i%3==0)
                {
                    sum+=i;
                }
                increment++;
            }
            i++;
        }


        System.out.println(sum);
    }
}
