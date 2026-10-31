import java.util.Scanner;

public class LeftRotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        
        // rotateArrayByKBruteForce(arr, k);
        // rotateArrayByKBetter(arr, k);
        rotateArrayByKOptimal(arr, k);
    }

    public static void rotateArrayByKBruteForce(int[] nums, int k) {
        int n = nums.length;

        for(int j=0; j<k; j++) {  
            int temp = nums[0];
            for(int i=1; i<n; i++) {
                nums[i-1] = nums[i];
            }

            nums[n-1] = temp;
        }
    }

    public static void rotateArrayByKBetter(int[] nums, int k) {
        int n = nums.length;

        k %= n;

        int[] temp = new int[k];

        for(int i=0; i<k; i++) {
            temp[i] = nums[i];
        }


        for(int i=k; i<n; i++) {
            nums[i-k] = nums[i];
        }

        for(int i=0; i<k; i++) {
            nums[n-k+i] = temp[i];
        }
    }

    public static void rotateArrayByKOptimal(int[] nums, int k) {
        int n = nums.length;

        k%=n;

        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while(i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }


}
