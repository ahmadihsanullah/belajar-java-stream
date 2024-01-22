package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiviTypeOperationTest {
    @Test
    void testCreatePrimitiveStream() {
        IntStream intStream = IntStream.of(1,2,3,4,5);
        IntStream intStream2 = IntStream.range(1, 100);
        IntStream intStreamBuilder = IntStream.builder().add(1).add(2).add(3).build();
        intStream.forEach(number -> System.out.println(number));
        System.out.println("--------------\n");
        intStream2.forEach(number -> System.out.println(number));
        System.out.println("--------------\n");
        intStreamBuilder.forEach(System.out::println);
        System.out.println("--------------\n");
        
    }

    @Test
    void testPrimitiveOperation() {
        OptionalDouble optionalDouble = IntStream.range(1, 100).average();
        optionalDouble.ifPresent(System.out::println);

        Stream<String> string = IntStream.range(1,10).mapToObj(number -> String.valueOf(number));
        string.forEach(System.out::println);
    }
}
