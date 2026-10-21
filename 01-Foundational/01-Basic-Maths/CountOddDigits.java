import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(countOddDigit(n));
    }

    public static  int countOddDigit(int n) {
        if(n == 0)
            return 0;

        int count = 0;
        while(n > 0) {
            int digit = n % 10;
            if(digit%2 == 1)
                count++;
            n /= 10;
        }

        return count;
    }
}
