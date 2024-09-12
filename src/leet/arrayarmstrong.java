package leet;

public class arrayarmstrong {
    public static void main(String[] args) {
        int[] arr={153,370,70,60,153};
        boolean arm=true;
        for(int i=0;i<arr.length;i++)
        {
            int temp=0;
            int n=arr[i];
            while (n>0)
            {
                int a=n%10;
                temp=temp+(a*a*a);
                n=n/10;

            }
            if(arr[i]==temp)
            {
                System.out.println(arr[i]);
                int sum=arr[i];
                sum=0;
                System.out.println(sum);

            }


        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}

