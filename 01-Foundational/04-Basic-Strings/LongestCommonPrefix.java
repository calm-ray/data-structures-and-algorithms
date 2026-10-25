import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefixOptimal(String[] strs) {
        if(strs.length == 0)
            return "";

        String prefix = strs[0];

        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        int plen = 0;
        while(true) {
            if(plen < strs[0].length()) {
                boolean flag = true;
                char ch = strs[0].charAt(plen);
                for(int i=1; i<strs.length; i++) {
                    if(plen < strs[i].length() && strs[i].charAt(plen) == ch) {

                    } else {
                        flag = false;
                        break;
                    }
                }

                if(flag) 
                    plen++;
                else
                    break;
            } else {
                break;
            }
        }

        return strs[0].substring(0, plen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextLine();
        
        System.out.println(longestCommonPrefix(arr));
    }
}
