import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        reverse(arr, n);

        for(int num: arr)
            System.out.print(num+" ");

        System.out.println();
    }

    public static void reverse(int[] arr, int n) {
        int i=0, j=n-1;

        while(i <= j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}
