import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(cleanString);
        String reverseString = new StringBuilder(cleanString).reverse().toString();
        System.out.println(reverseString);

        return cleanString.equals(reverseString);
    }
}
