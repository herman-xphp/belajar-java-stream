package muslim.dev.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AggregateOperationTest {

  @Test
  void testMax() {
    List.of("Herman", "Ahmad", "Budi").stream()
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  @Test
  void testMin() {
    List.of("Gugun", "Ahmad", "Budi").stream()
        .max(Comparator.naturalOrder())
        .ifPresent(System.out::println);
  }

  @Test
  void testCount() {
    long count = List.of("Herman", "Rudi", "Rahmat").stream()
        .count();
    System.out.println(count);
  }

  @Test
  void testSum() {
    var result = List.of(2, 1, 3, 5, 6, 7, 5, 3).stream()
        .reduce(0, (value, item) -> value + item);

    System.out.println(result);
  }

  @Test
  void testFactorial() {
    var result = List.of(1, 2, 3, 4, 5).stream()
        .reduce(0, (value, item) -> value * item);

    System.out.println(result);
  }
}
