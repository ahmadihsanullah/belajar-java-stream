package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream()  {
        Stream<String> streamEmpty = Stream.empty();
        streamEmpty.forEach(System.out::println);

        Stream<String> oneStream = Stream.of("ahmad");
        oneStream.forEach(System.out::println);

        String data = "ihsan";
        Stream<String> nullableStream = Stream.ofNullable(data);
        nullableStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> streamString = Stream.of("ahmad", "ihsanullah");
        streamString.forEach(System.out::println);

        Stream<Integer> streamInteger = Stream.of(1,2,3,4,4);
        streamInteger.forEach(System.out::println);

        Stream<String> streamArray = Arrays.stream(new String[]{
                    "ahmad", "ihsanullah", "rabbani"
        });
        streamArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> stringCollection = List.of("ahmad","ihsanullah","rabbani");
        Stream<String> stream = stringCollection.stream();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        //generate data tidak berubah
        Stream<String> stringInfiniteStream = Stream.generate(()-> "ahmad ihsan");
//        stringInfiniteStream.forEach(System.out::println);
        //Iterate data dapat berubah
        Stream<Integer> integerInfiniteStream = Stream.iterate(1, value-> value + 1);
        integerInfiniteStream.forEach(System.out::println);
    }
}
