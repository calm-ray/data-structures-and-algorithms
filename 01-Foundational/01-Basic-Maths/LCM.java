import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println(lcm(n1, n2));
    }

    public static int lcm(int n1, int n2) {
        return (n1*n2) / gcd(n1, n2);
    }

    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        
        return gcd(b, a%b);
    }
}
