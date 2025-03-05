package muslim.dev.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {

  @Test
  void testCreateStreamBuilder() {
    Stream.Builder<String> builder = Stream.builder();
    builder.accept("Herman");
    builder.add("Rahmat").add("Anditor");

    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);
  }

  @Test
  void testCreateStreamBuilderSimplify() {
    Stream<Object> stream = Stream.builder()
        .add("Herman").add("Anto").build();

    stream.forEach(System.out::println);
  }

}
