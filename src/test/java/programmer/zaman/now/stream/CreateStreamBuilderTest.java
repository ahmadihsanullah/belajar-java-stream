package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> stringBuilder =  Stream.builder();
        stringBuilder.accept("ahmad");
        stringBuilder.add("ihsanullah").add("rabbani");

        Stream<String> stream = stringBuilder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder().
                add("ahmad").add("ihsanullah").add("rabbani").build();

        stream.forEach(System.out::println);
    }
}
