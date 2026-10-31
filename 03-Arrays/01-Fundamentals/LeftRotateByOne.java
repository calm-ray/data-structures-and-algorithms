import java.util.Scanner;

public class LeftRotateByOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        
        // rotateArrayByOneBruteForce(arr);
        rotateArrayByOneOptimal(arr);
    }

    public static void rotateArrayByOneBruteForce(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for(int i=1; i<n; i++) {
            arr[i-1] = nums[i];
        }

        arr[n-1] = nums[0];

        for(int i=0; i<n; i++) {
            nums[i] = arr[i];
        }
    }

    public static void rotateArrayByOneOptimal(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        for(int i=1; i<n; i++) {
            nums[i-1] = nums[i];
        }

        nums[n-1] = temp;
    }

}
