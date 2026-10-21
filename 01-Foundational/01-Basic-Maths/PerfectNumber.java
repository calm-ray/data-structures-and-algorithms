import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(checkPerfectNumber(n));
    }

    public static boolean checkPerfectNumber(int num) {
        int res = 0;
        
        for(int i=1; i<=num/2; i++) {
            if(num%i==0)
                res += i;
        }
        return num == res;
    }

    public boolean checkPerfectNumberOptimal(int num) {
        if(num <= 1)
            return false;

        int res = 1;
        
        for(int i=2; i*i<=num; i++) {
            if(num%i==0) {
                if(i*i == num)
                    res += i;
                else
                    res += i + (num/i);
            }
        }
        return num == res;
    }
}
