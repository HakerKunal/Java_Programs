import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("Kunal");
        list.add("Batham");
        list.add("Ankit");
        list.add("Piyush");

        for(String name:list){
            System.out.println(name);
        }

        Iterator<String> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
