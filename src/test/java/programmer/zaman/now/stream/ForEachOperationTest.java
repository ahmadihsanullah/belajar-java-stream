package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("ahmad","ihsanullah","rabbani").stream()
                .map(name -> {
                    System.out.println("Before change name :" + name);
                    String upper = name.toUpperCase();
                    System.out.println("After change name :" + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("FINAL NAME :" + name));
    }

    @Test
    void testPeekAfter() {
        List.of("ahmad","ihsanullah","rabbani").stream()
                .peek(name -> System.out.println("Before change name :" + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("After change name :" + upper))
                .forEach(name -> System.out.println("FINAL NAME :" + name));
    }
}
