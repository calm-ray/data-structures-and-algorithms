import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] nums) {
        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        return max;
    }
}
