import java.util.Scanner;

/***
 * DivideThePiles
 * 
 * Description
 *   
 *   There are N piles of stones in front of you. ith pile contains Ai number of stones.
 *   You want to find whether it is possible to split each pile into 1 or more piles of X (≥ 2) stones such that each splitted-pile has exactly X stones.
 *   Note that X should be the same for each pile.
 *
 * Input Format
 *
 *   The first line contains T (1 ≤ T ≤ 100000), the number of test cases. The description of each test case is as follows:
 *   The first line contains N, the number of piles (1 ≤ N ≤ 100000).
 *   The second line contains N space-separated positive integers A1, A2, ..., AN (2 ≤ Ai ≤ 109).
 *   It is guaranteed that sum of N over all test cases doesn't exceed 106.
 *
 * Output Format
 *
 *   For each test case, print "Yes" (without quotes) if it is possible to split. Otherwise, print "No" (without quotes).
 */

public class DivideThePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println(divideThePiles(arr));
    }

    public static boolean divideThePiles(int[] arr) {
        int g = 0;
        for(int i=0; i<arr.length; i++) {
            g = gcd(arr[i], g);
        }
        return g > 1;
    }

    public static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}

