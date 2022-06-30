import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAddAll {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();


        items.add("Kunal");
        items.add("Batham");

        Collections.addAll(items, "Nikhil", "Rahul", "Ankit");

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}
