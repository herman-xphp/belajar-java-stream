package muslim.dev.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachOperationTest {

  @Test
  void testPeekBefore() {
    List.of("Herman", "Firman", "Gugun").stream()
        .map(name -> {
          System.out.println("Before Change Name to Upper: " + name);
          String upper = name.toUpperCase();
          System.out.println("Change Name to Upper : " + upper);
          return upper;
        })
        .forEach(name -> System.out.println("Final Name : " + name));
  }

  @Test
  void testPeekAfter() {
    List.of("Herman", "Firman", "Gugun").stream()
        .peek(name -> System.out.println("Before Change Name to Upper: " + name))
        .map(name -> name.toUpperCase())
        .peek(upper -> System.out.println("Change Name to Upper : " + upper))
        .forEach(name -> System.out.println("Final Name : " + name));
  }
}
