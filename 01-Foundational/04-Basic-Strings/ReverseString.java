import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chArr = str.toCharArray();
        reverseString(chArr);
        System.out.println(Arrays.toString(chArr));
    }
    public static void reverseString(char[] s) {
        int l=0, r=s.length-1;

        while(l<r) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
    }
}
