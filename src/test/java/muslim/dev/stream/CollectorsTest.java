package muslim.dev.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CollectorsTest {

  Stream<String> getStream() {
    return Stream.of("Herman", "Eko", "Gugun");
  }

  @Test
  void testCollection() {
    Set<String> set = getStream().collect(Collectors.toSet());
    System.out.println(set);
    Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
    System.out.println(immutableSet);

    List<String> list = getStream().collect(Collectors.toList());
    System.out.println(list);
    List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
    System.out.println(immutableList);
  }

  @Test
  void testMap() {
    Map<String, Integer> map = getStream().collect(Collectors.toMap(
        name -> name,
        name -> name.length()));
    System.out.println(map);
  }
}
