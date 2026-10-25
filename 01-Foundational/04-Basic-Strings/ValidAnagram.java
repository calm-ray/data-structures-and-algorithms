import java.util.Scanner;

public class ValidAnagram {
    
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] sfreq = new int[26];

        for(int i=0; i<s.length(); i++) {
            sfreq[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++) {
            if(sfreq[t.charAt(i)-'a'] <= 0)
                return false;
            sfreq[t.charAt(i)-'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        System.out.println(isAnagram(s, t));
    }
}
