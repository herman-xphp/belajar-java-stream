package muslim.dev.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilteringOperationTest {

  @Test
  void testFilter() {

    List.of("Herman", "Anto", "Rahmat", "Ahmad").stream()
        .filter(name -> name.length() > 4)
        .forEach(System.out::println);

    List.of(1, 2, 3, 4, 5, 6, 7, 7, 10).stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);
  }

  @Test
  void testDistinct() {
    List.of("Herman", "Andi", "Galang", "Herman", "Budi", "Rudi").stream()
        .distinct()
        .forEach(System.out::println);
  }

}
