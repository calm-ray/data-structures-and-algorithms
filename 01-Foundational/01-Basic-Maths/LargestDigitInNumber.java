import java.util.Scanner;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(largestDigit(n));
    }
    
    public static int largestDigit(int n) {
        int max = -1;

        if(n == 0)
            return 0;

        while(n > 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }

        return max;
    }
}
