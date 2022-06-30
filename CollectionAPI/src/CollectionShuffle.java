import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionShuffle {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("kunal");
        list.add("Batham");
        list.add("Nikhil");
        list.add("ankit");

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);


        //shufle by random number

        Collections.shuffle(list,new Random(3));
        System.out.println(list);

    }
}
