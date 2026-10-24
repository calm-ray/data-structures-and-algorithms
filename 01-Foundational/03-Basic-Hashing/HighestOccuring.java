import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HighestOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(mostFrequentElement(arr));
    }

    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> m = new TreeMap<>();

        for(int i=0; i<nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }

        int minCount = 0, minNum = -1;
        for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
            if(entry.getValue() > minCount) {
                minCount = entry.getValue();
                minNum = entry.getKey();
            }
        }

        return minNum;
    }
}
