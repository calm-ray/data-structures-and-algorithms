import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(armstrongNumber(n));
    }

    public static boolean armstrongNumber(int x) {
        int digits = (int) Math.floor(Math.log10(x) + 1);

        if (x == 0)
            return true;

        int n = x, res = 0;
        while (n > 0) {
            int digit = n % 10;
            res += (int) Math.pow(digit, digits);
            n /= 10;
        }

        return res == x;
    }
}
