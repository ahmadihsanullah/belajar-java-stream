package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RetrieveringOperationTest {
    @Test
    void testRetrievingOperation() {
        List<String> names = List.of("ahmad","ihsan","hanif","andi","zaky","rehan","iha");

        names.stream().limit(3).forEach(System.out::println);
        names.stream().skip(3).forEach(System.out::println);

//        take while => ahmad, ihsan, hanif, rehan, andi
//        saat sudah sampai andi kondisi sudah false maka sudah berhenti takewhilenya
        names.stream().takeWhile(name -> name.length() > 4).forEach(System.out::println);


//        drop while => ahmad, ihsan, hanif, rehan, andi
//        saat sudah sampai andi kondisi sudah tidak akan didrop maka sudah berhenti drop while.
//        jadi data kesananya tetap akan dieksekusi walaupun memiliki length lebih dari 4
        names.stream().dropWhile(name -> name.length() > 4).forEach(System.out::println);

        names.stream().findAny().ifPresent(name -> System.out.println(name));
        names.stream().findFirst().ifPresent(name -> System.out.println(name));
    }
}
