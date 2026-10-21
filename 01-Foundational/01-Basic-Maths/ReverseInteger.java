import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        boolean isSigned = n < 0 ? true : false;

        n = (int) Math.abs(n);

        int result = 0;
        while(n > 0) {
            int digit = n % 10;

            if(result > (Integer.MAX_VALUE - digit) / 10)
                return 0;

            result = result * 10 + digit;
            n /= 10;
        }

        return isSigned ? -result : result;
    }

    public static int reverseOptimal(int n) {
        boolean isSigned = n < 0;

        String val = String.valueOf(Math.abs(n));

        String rev = new StringBuilder(val).reverse().toString();

        int res = 0;
        try {
            res = Integer.parseInt(rev);
        } catch (NumberFormatException e) {
            return 0;
        }

        return isSigned ? -res : res;
    }
}
