package muslim.dev.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LazyValuationTest {

  @Test
  void testIntermediateOperation() {

    List<String> names = List.of("Herman", "Akbar", "Rudi");

    Stream<String> upper = names.stream()
        .map(name -> {
          System.out.println("Change " + name + " to UPPERCASE");
          return name.toUpperCase();
        });
  }

  @Test
  void testTerminalOperation() {

    List<String> names = List.of("Herman", "Akbar", "Rudi");

    names.stream()
        .map(name -> {
          System.out.println("Change " + name + " to UPPERCASE");
          return name.toUpperCase();
        })
        .map(upper -> {
          System.out.println("Change " + upper + " to Mr.");
          return "Mr. " + upper;
        })
        .forEach(System.out::println);
  }

}
