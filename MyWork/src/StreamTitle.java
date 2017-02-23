import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTitle {
  public static void main(String[] args) {
//    List<String> title = Arrays.asList("JAVA","TEST","AAA");
//    Stream<String> s = title.stream();
//    s.forEach(System.out::println);
        
//    ArrayList<String> a = new ArrayList<>();
//    a.add("aaa");
//    List<Object> parts = Arrays.asList(a.toArray());
    IntStream.range(0, 10).forEach(System.out::println);
  }
  
  public static void test(String a){
    System.out.println(a);
  }
}
