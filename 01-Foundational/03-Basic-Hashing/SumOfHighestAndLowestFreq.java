import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfHighestAndLowestFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(sumHighestAndLowestFrequency(arr));
    }
    public static int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }

        int highestFreq = Integer.MIN_VALUE, lowestFreq = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
            int val = entry.getValue();

            if(val > highestFreq)
                highestFreq = val;
            if(val < lowestFreq) 
                lowestFreq = val;
        }

        return highestFreq + lowestFreq;
    }
}
