package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsOperationTest {

    Stream<String> getStream(){
        return Stream.of("ahmad","ihsanullah","rabbani","ahmad");
    }
    @Test
    void testCollectorsCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);
    }

    @Test
    void testCollectorsMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name->name,
                name->name.length(),
                (oldKey, newKey) -> oldKey
        ));
        System.out.println(map);
    }
}
