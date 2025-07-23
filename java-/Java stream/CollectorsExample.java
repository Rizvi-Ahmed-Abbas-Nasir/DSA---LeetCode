import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CollectorsExample {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "Anna", "David");

        // 1️⃣ Collect to List
        List<String> nameList = names.stream()
                .collect(Collectors.toList());
        System.out.println("1. To List: " + nameList);

        // 2️⃣ Collect to Set
        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());
        System.out.println("2. To Set: " + nameSet);

        // 3️⃣ Joining
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("3. Joined: " + joined);

        // 4️⃣ Counting
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println("4. Count: " + count);

        // 5️⃣ Summarizing (length of names)
        IntSummaryStatistics stats = names.stream()
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("5. Summary Stats: " + stats);

        // 6️⃣ To Map (name -> name length)
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println("6. To Map: " + nameLengthMap);

        // 7️⃣ Grouping By (group by first character)
        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("7. Grouping by first character: " + grouped);

        // 8️⃣ Partitioning By (name length > 4)
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println("8. Partitioning by length > 4: " + partitioned);

        // 9️⃣ Using mapping() inside groupingBy()
        Map<Character, List<Integer>> groupLength = names.stream()
                .collect(Collectors.groupingBy(
                        name -> name.charAt(0),
                        Collectors.mapping(String::length, Collectors.toList())));
        System.out.println("9. Grouping by first char, mapped to lengths: " + groupLength);
    }
}
