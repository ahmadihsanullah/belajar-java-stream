package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    void testMap() {
        List.of("ahmad","ihsanullah","rabbani").stream()
                .map(name -> name.toUpperCase())
                .map(value -> value.length())
                .forEach(System.out::println);
    }

    @Test
    void testFlatMap() {
        List<String> list = List.of("ahmad","ihsan","rabbani");
            list.stream()
                .flatMap(upper -> Stream.of(upper.toUpperCase(), upper.length()))
                .forEach(System.out::println);
    }
}
