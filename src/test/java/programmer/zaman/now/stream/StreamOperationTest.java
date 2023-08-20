package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testStreamOperation() {
        List<String> names = List.of("Ahmad", "Ihsanullah","Rabbani");
        Stream<String> streamNames = names.stream();
        Stream<String> stream = streamNames.map(name -> name.toUpperCase());

        stream.forEach(System.out::println);

        names.forEach(System.out::println);
    }
}
