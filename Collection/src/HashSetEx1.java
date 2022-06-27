import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<String> list=new HashSet<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("five");

        System.out.println(list);
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        list.remove("five");
        System.out.println(list);

    }
}
