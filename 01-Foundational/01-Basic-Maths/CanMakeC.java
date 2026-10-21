import java.util.Scanner;

/***
 * CanMakeC
 * 
 * Description
 *   
 *   Let us see the following equation,
 *
 *   Ax + By = C
 *
 *   Given three positive integers A, B and C.
 *
 *   You have to determine whether there exists at least one solution for some integers value of x and y where x, y may be negative or non-negative integers.
 *
 * Input Format
 *
 *   The first line contains T (1 ≤ T ≤ 100000), the number of test cases.
 *   Each of the next T lines contains three positive integers A, B, C (1 ≤ A, B, C ≤ 109).
 *
 * Output Format
 *
 *   Print "Yes" (without quotes) if at least one solution exits, otherwise print "No" (without quotes).
 */

public class CanMakeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(canMakeC(a, b, c));
    }

    public static boolean canMakeC(int a, int b, int c) {
        int g = gcd(a, b);
        return c%g == 0;
    }

    public static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
