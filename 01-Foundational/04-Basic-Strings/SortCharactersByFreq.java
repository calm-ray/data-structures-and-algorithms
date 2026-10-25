import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortCharactersByFreq {
    public static String frequencySort(String s) {
        Map<Character, Long> counts = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> sortedByFreq = counts.entrySet().stream()
            .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        String res = sortedByFreq.entrySet().stream()
            .map(entry -> String.valueOf(entry.getKey()).repeat(entry.getValue().intValue()))
            .collect(Collectors.joining());

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(frequencySort(str));
    }
}
