package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {

    @Test
    void testMax() {
        List.of(23,11,26,24,38,36,27,29).stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of(1,2,3,4,5).stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testSum() {
        Integer reduce = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        // 0. value= 0
        // 1. value=0 item=1 =1
        // 2. value=1 item=2 =3
        // 3. value=3 item=3 =6
        // 4. value=6 item=4 = 10
        // 5. value=10 item=5 = 15
        System.out.println(reduce);
    }

    @Test
    void testFactorial() {
        Integer reduce = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(reduce);
    }

    @Test
    void testAmbilAngkaBelakangYangPalingBesar() {
        Comparator<Integer> comparator = (o1, o2) -> {
            if(o1 % 10 > o2 % 10){
                return 1;
            }
            return -1;
        };

        List.of(21,22,13,23,24,29,25,28,27,26,92).stream().sorted(comparator).forEach(System.out::println);
//
//        List.of(29,34,31, 65,77,82,98).stream()
//                .max(comparator)
//                .ifPresent(System.out::println);

    }
}
