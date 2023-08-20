package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("ahmad", "ihsanullah", "rabbani");

        Stream<String> stream = list.stream();

        Stream<String> streamNames = stream.map(name -> name.toUpperCase());

        Stream<String> stringStream = streamNames.map(upper -> "Mr. " + upper);

        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk() {
        List.of("ahmad", "ihsanullah", "rabbani").stream().
                map(name -> name.toUpperCase()).
                map(upper -> "Mr. " + upper).
                forEach(System.out::println);
    }
}
