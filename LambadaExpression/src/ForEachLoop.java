import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("kunal");
        list.add("Ankit");
        list.add("Nikhil");
        list.add("Ayush");
        list.forEach((n) -> System.out.println(n)
        );
    }


}
