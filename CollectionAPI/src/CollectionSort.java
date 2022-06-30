import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Kunal");
        items.add("Batham");

        Collections.addAll(items, "Nikhil", "Rahul", "Ankit");
        Collections.sort(items);

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }

        System.out.println();

        Collections.sort(items, Collections.reverseOrder());

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}
