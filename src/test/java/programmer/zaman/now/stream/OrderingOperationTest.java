package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("ahmad","ihsanullah","rabbani","hanif","hizulhaq").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> comparator = Comparator.reverseOrder();

        Comparator<String> comparator2 = (o1, o2) -> o2.compareTo(o1);

        List.of("ahmad","ihsanullah","rabbani","hanif","hizulhaq").stream()
                .sorted(comparator2 )
                .forEach(System.out::println);
    }
}
