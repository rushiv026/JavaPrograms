package leet;

public class uyuyr {
    static void num(int[] arr)
    {
        System.out.println(arr[0]);
        arr[0]=30;
        num1(arr);

    }
    static void num1(int[] arr)
    {
        System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int arr[]={10,20};
        System.out.println(arr[0]);
        num(arr);
        System.out.println(arr[0]);
    }
}
