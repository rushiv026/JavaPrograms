package leet;

public class rotateArray {

    public static void main(String[] args) {
        int[] arr = {7, 11, 9, 10, 22, 23, 30, 37};


        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(arr[i]);

            }
        }
    }
}
