import java.util.Scanner;

public class CountOdds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(sum(arr, n));
    }

    public static int sum(int[] arr, int n) {
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] % 2 != 0)
                count++;
        }

        // return (int) IntStream.of(arr).filter(num -> num % 2 != 0).count();
        return count;
    }
}
