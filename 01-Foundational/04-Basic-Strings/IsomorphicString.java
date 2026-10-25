import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);

            if(m1.containsKey(chs) && !(m1.get(chs) == cht)
                || m2.containsKey(cht) && !(m2.get(cht) == chs)) {
                return false;
            }
            m1.put(chs, cht);
            m2.put(cht, chs);
            
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        System.out.println(isIsomorphic(s, t));
    }
}
