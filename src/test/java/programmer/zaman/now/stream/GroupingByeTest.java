package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByeTest {
    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> collect = Stream.of("ahmad","ihsanullah","rabbani")
                .collect(Collectors.groupingBy(words -> words.length() > 5 ? "panjang" : "Kecil"));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(number -> number > 5 ? true : false));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> collect = Stream.of("ahmad","ihsanullah","rabbani")
                .collect(Collectors.partitioningBy(words -> words.length() > 5 ? true : false));

        System.out.println(collect);
    }

}
