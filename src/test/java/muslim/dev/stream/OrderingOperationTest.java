package muslim.dev.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderingOperationTest {

  @Test
  void testSorted() {
    List.of("Ani", "Galang", "Eko", "Rudi", "Ardiansyah").stream()
        .sorted()
        .forEach(System.out::println);
  }

  @Test
  void testSortedWithComparator() {
    Comparator<String> reverseComparator = Comparator.reverseOrder();
    List.of("Ani", "Galang", "Eko", "Rudi", "Ardiansyah").stream()
        .sorted(reverseComparator)
        .forEach(System.out::println);
  }
}
