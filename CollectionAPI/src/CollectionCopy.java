import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCopy {
    public static void main(String[] args) {
        List<String> destination_List = new ArrayList<>();

        destination_List.add("One");
        destination_List.add("Two");
        destination_List.add("Three");
        destination_List.add("Four");

        System.out.println(
                "The Original Destination list is ");

        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }
        System.out.println();

        List<String> source_List = new ArrayList<>();

        source_List.add("Five");
        source_List.add("Six");
        source_List.add("Seven");

        Collections.copy(destination_List, source_List);

        System.out.println(
                "The Destination List After copying is ");

        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }
    }
}
