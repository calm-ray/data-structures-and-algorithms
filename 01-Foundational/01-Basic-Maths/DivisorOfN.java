import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class DivisorOfN {
    public int[] divisors(int n) {
        Set<Integer> ans = new TreeSet<>();
        for(int i=1; i*i<=n; i++) {
            if(n%i == 0) {
                if(i*i == n)
                    ans.add(i);
                else {
                    ans.add(i);
                    ans.add(n/i);
                }
            }
        }

        int[] res = new int[ans.size()];

        int i = 0;
        for(int num: ans)
            res[i++] = num;

        return res;

        // Using streams
        // return IntStream.rangeClosed(1, (int) Math.sqrt(n))
        //         .filter(i -> n % i == 0)
        //         .flatMap(i -> IntStream.of(i, n / i))
        //         .distinct()
        //         .sorted()
        //         .toArray();
    }
}
