import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("kunal");
        tree.add("kunal");
        tree.add("nikhil");
        tree.add("one");
        System.out.println(tree);
        Iterator itr=tree.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
