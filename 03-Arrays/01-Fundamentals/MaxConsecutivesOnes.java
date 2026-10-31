import java.util.Scanner;

public class MaxConsecutivesOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int n = nums.length;
        
        int i = 0;
        while(i < n) {
            if(nums[i] != 0) {
                int j = i + 1;
                while(j < n && nums[j] != 0) {
                    j++;
                }

                max = Math.max(j-i, max);
                i = j;
            } else {
                i++;
            }
        }

        return max;
    }
}
