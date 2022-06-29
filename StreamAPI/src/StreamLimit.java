import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        Stream<Integer> infiniteEvenNumbers=Stream.iterate(0,n->n+2);
        List<Integer> list=infiniteEvenNumbers.limit(10).collect(Collectors.toList());
        System.out.println(list);
    }
}
