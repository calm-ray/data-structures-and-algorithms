import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(countDigit(n));

        int digits = (n == 0) ? 1 : (int) Math.floor(Math.log10(n) + 1);
        System.out.println(digits);
    }

    public static int countDigit(int n) {
        int digits = 0;

        if(n == 0)
            return 1;

        while(n > 0) {
            digits += 1;
            n /= 10;
        }

        return digits;
    }
}
