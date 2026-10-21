import java.util.Scanner;

public class PrimesTillN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for(int i=0; i<n; i++)
            if(isPrime(i))
                count++;
        return count;
    }

    public static boolean isPrime(int n) {
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
