package java_prog;
import java.util.stream.Stream;

public class AnyMatch {
    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(2, x -> x * 2);
        System.out.println(infinite.anyMatch(test -> test / 8  == 0));
    }
}
