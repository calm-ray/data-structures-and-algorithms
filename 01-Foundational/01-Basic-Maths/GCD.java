import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println(GCDOptimal(n1, n2));
    }

    public static int GCD(int n1, int n2) {
        int min = Math.min(n1, n2);

        for(int i=min; i>=1; i--) {
            if(n1%i == 0 && n2%i==0)
                return i;
        }

        return 1;
    }

    public static int GCDOptimal(int a, int b) {
        if(a == 0 && b == 0)
            return 0;

        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
