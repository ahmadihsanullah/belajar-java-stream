package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("ahmad", "ihsanullah","rabbani");
        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UpperCase");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("ahmad", "ihsanullah","rabbani");
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UpperCase");
                    return name.toUpperCase();
                })
                .forEach(upper -> System.out.println(upper));

    }
}
