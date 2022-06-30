import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionRotate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("kunal");

        System.out.println("Original List : " + mylist);

        Collections.rotate(mylist, 2);

        System.out.println("Rotated List: " + mylist);
    }
}
