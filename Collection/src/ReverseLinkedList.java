import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("kunal");
        list.add("ayush");
        list.add("rahul");
        list.add("abhishek");

        Iterator<String> i=list.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
