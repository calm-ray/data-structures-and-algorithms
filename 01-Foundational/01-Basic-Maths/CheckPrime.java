import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        if(n <= 1) 
            return false;
        for(int i=2; i<n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeOptimal(int n) {
        if(n <= 1) 
            return false;

        if(n == 2)
            return true;

        if(n%2 == 0)
            return false;

        for(int i=3; i*i<=n; i+=2) {
            if(n%i == 0)
                return false;
        }

        return true;
    }
}
