import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate <Integer> pre=(x)->(x>18);
        System.out.println(pre.test(12));
        System.out.println(pre.test(19));
    }
}
