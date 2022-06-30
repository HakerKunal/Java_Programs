import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFIll {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("kunal");
        list.add("nikhil");
        list.add("ankit");

        System.out.println("list before fill- "+list);

        Collections.fill(list,"name");

        System.out.println("list after fill- "+list);

    }
}
