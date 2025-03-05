package muslim.dev.stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetrievingOperationTest {

  @Test
  void testLimit() {
    List.of("Herman", "Galang", "Rudi", "Ardiansyah").stream()
        .limit(2)
        .forEach(System.out::println);
  }

  @Test
  void testSkip() {
    List.of("Herman", "Galang", "Rudi", "Ardiansyah").stream()
        .skip(2)
        .forEach(System.out::println);
  }

  @Test
  void testTakeWhile() {
    List.of("Herman", "Galang", "Rudi", "Ardiansyah").stream()
        .takeWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  @Test
  void testDropWhile() {
    List.of("Ani", "Galang", "Eko", "Rudi", "Ardiansyah").stream()
        .dropWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  @Test
  void testFindAny() {
    Optional<String> optional = List.of("Ani", "Galang", "Eko", "Rudi", "Ardiansyah").stream()
        .findAny();
    optional.ifPresent(System.out::println);
  }

  @Test
  void testFindFirst() {
    Optional<String> optional = List.of("Ani", "Galang", "Eko", "Rudi", "Ardiansyah").stream()
        .findFirst();
    optional.ifPresent(System.out::println);
  }

}
