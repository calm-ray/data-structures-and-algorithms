import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargestElement(int[] nums) {

        // int max = Integer.MIN_VALUE;
        // for(int num: nums) {
        //     max = Math.max(max, num);
        // }

        // int smax = Integer.MIN_VALUE;
        // boolean flag = false;

        // for(int num: nums) {
        //     if(num < max) {
        //         if(!flag || num > smax) {
        //             smax = num;
        //             flag = true;
        //         }
        //     }
        // }

        // if(!flag)
        //     return -1;
        
        // return smax;

        return Arrays.stream(nums)
                    .boxed()
                    .sorted(Comparator.reverseOrder())
                    .distinct()
                    .skip(1)
                    .findFirst()
                    .orElse(-1);
    }
}
