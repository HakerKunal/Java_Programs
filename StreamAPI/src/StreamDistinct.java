import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println("List without stream distinct method is- " + list);
        System.out.println("size is- " + (long) list.size());


        List<Integer> modifiedList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("List after Distinct method is- "+modifiedList);
        System.out.println("size is-"+modifiedList.stream().count());


    }
}
