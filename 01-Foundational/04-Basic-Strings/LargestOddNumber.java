import java.util.Scanner;

public class LargestOddNumber {

    public static String largestOddNumber(String s) {
        int n = s.length() - 1;
        while(n >= 0) {
            int d = s.charAt(n) - 48;
            if(d%2 == 1) {
                return s.substring(0, n+1);
            }
            n--;
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(largestOddNumber(str));
    }
}
