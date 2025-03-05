package muslim.dev.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationTest {

  @Test
  void testMap() {
    List.of("Herman", "Anto", "Rahmat").stream()
        .map(name -> name.toUpperCase())
        .map(upper -> upper.length())
        .forEach(System.out::println);
  }

  @Test
  void testFlatMap() {
    List.of("Herman", "Anto", "Rahmat").stream()
        .map(name -> name.toUpperCase())
        .flatMap(upper -> Stream.of(upper, upper.length()))
        .flatMap(value -> Stream.of(value, value, value))
        .forEach(System.out::println);
  }
}
