import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondHighestOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(secondMostFrequentElement(arr));
    }

    public static int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++) 
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);

        boolean hasHighest = false;
        boolean hasSecond = false;
        int highestFreq = 0;
        int highestFreqNum = 0;
        int secondHighestFreq = 0;
        int secondHighestFreqNum = 0;

        for(Map.Entry<Integer, Integer> entry: m.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(!hasHighest) {
                highestFreq = value;
                highestFreqNum = key;
                hasHighest = true;
            } else if(value > highestFreq) {
                secondHighestFreq = highestFreq;
                secondHighestFreqNum = highestFreqNum;

                hasSecond = true;

                highestFreq = value;
                highestFreqNum = key;
            } else if(value == highestFreq) {
                if(key < highestFreqNum) {
                    highestFreqNum = key;
                }
            } else {
                if (!hasSecond ||
                    value > secondHighestFreq ||
                    (value == secondHighestFreq && key < secondHighestFreqNum)) {
                    secondHighestFreq = value;
                    secondHighestFreqNum = key;
                    hasSecond = true;
                }
            }
    
        }
        if (!hasSecond) {
            return -1;
        }
 
        return secondHighestFreqNum;
    }
}
