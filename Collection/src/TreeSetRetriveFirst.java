import java.util.TreeSet;

public class TreeSetRetriveFirst {
    public static void main(String[] args) {
        TreeSet<String> list=new TreeSet<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list.first());
    }
}
