import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ankit");
        list.add("kunal");
        list.add("Ravi");
        list.add("Ravi");
        System.out.println(list);

        HashSet<String> list2=new HashSet<>(list);
        System.out.println(list2);
    }
}
