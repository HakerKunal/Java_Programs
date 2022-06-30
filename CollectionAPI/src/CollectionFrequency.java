import java.util.ArrayList;
import java.util.Collections;

public class CollectionFrequency {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<String>();
        list.add("code");
        list.add("code");
        list.add("quiz");
        list.add("code");

        System.out.println("The frequency of the word code is: " +
                Collections.frequency(list, "code"));
    }
}
