package muslim.dev.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationTest {

  @Test
  void testAnyMatch() {
    boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
        .anyMatch((number -> number > 20));

    System.out.println(match);
  }

  @Test
  void testAllMatch() {
    boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
        .allMatch((number -> number > 0));

    System.out.println(match);
  }

  @Test
  void testNoneMatch() {
    boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
        .noneMatch((number -> number > 30));

    System.out.println(match);
  }
}
