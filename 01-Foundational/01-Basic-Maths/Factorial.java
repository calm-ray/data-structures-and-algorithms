import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(factorialRecursive(n));
    }
    
    public static int factorialRecursive(int n) {
        if(n==0 || n==1)
            return 1;

        return n*factorial(n-1);
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
}
