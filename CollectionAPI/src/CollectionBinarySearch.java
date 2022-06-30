import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionBinarySearch {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Apple is at index "+ Collections.binarySearch(list,"Orange"));
    }
}