import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("kunal");
        list.add("nikhil");
        list.addFirst("piyush");
        System.out.println(list);
        list.addLast("rahul");
        System.out.println(list);
    }
}
