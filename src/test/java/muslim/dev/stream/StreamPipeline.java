package muslim.dev.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamPipeline {

  @Test
  void testStreamPipeline() {

    // JARANG DIGUNAKAN CARA SEPERTI INI
    List<String> list = List.of("Herman", "Rudi", "Ahmad");

    Stream<String> stream = list.stream();

    Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

    Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper);

    streamMr.forEach(System.out::println);
  }

  @Test
  void testStreamPipelineOk() {
    List<String> list = List.of("Herman", "Rudi", "Ahmad");

    list.stream()
        .map(name -> name.toUpperCase())
        .map(upper -> "Mr. " + upper)
        .forEach(System.out::println);
  }

}
