import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int n = x, res = 0;
        while(n > 0) {
            int digit = n % 10;
            res = res * 10 + digit;
            n = n / 10;
        }

        return x == res;
    }

    public static boolean isPalindromeOptimal(int x) {
        if(x < 0)
            return false;
        String rev = new StringBuilder(String.valueOf(x)).reverse().toString();
        boolean res = false;
        try {
            int val = Integer.parseInt(rev);
            res = val == x;
        } catch(NumberFormatException e) {
            return false;
        }
        return res;
    }
}
