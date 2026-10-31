import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int nums[], int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
