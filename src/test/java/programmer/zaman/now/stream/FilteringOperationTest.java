package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List.of("ahmad","ihsanullah","rabbani", "iha").stream()
                .filter(name -> name.length()  > 4)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("ahmad","ihsanullah","rabbani", "iha", "ahmad", "iha").stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> any = List.of("aji","ahmad", "ihsanullah", "rabbani", "iha", "ahmad", "iha").stream()
                .findAny();

        any.ifPresent(name -> System.out.println(name));
    }

    @Test
    void testFindFirst() {
        Optional<String> any = List.of("aji","ahmad", "ihsanullah", "rabbani", "iha", "ahmad", "iha").stream()
                .findFirst();

        any.ifPresent(name -> System.out.println(name));
    }
}
