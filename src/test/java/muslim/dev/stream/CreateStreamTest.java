package muslim.dev.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {

  @Test
  void testCreateEmptyOrSingleStream() {

    Stream<String> emptyStream = Stream.empty();
    emptyStream.forEach(data -> {
      System.out.println(data);
    });

    Stream<String> onStream = Stream.of("Herman");
    onStream.forEach(data -> {
      System.out.println(data);
    });

    String data = "null";
    Stream<String> emptyOrNoStream = Stream.ofNullable(data);
    emptyOrNoStream.forEach(item -> {
      System.out.println(item);
    });
  }

  @Test
  void testCreateStreamFromArray() {

    Stream<String> arrayStream = Stream.of("Herman", "Rahmat", "Ahmad", "Sudirman");
    arrayStream.forEach(data -> {
      System.out.println(data);
    });

    Stream<Integer> integerStream = Stream.of(1, 2, 3, 5, 6, 7, 9);
    integerStream.forEach(System.out::println);

    String[] array = new String[] { "Herman", "Sulkifli", "Andito" };
    Stream<String> streamFromArray = Arrays.stream(array);
    streamFromArray.forEach(System.out::println);
  }

  @Test
  void testCreateStreamFromCollection() {

    Collection<String> collection = List.of("Herman", "Rahmat", "Ahmad", "Sudirman");
    Stream<String> stringStream = collection.stream();
    stringStream.forEach(System.out::println);
  }

  @Test
  void testCreateInfiniteStream() {
    Stream<String> stream = Stream.generate(() -> "Herman");
    // stream.forEach(System.out::println);

    Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
    // iterate.forEach(System.out::println);
  }

}
