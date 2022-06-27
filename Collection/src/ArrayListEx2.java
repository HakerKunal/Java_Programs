import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Guava");
        list.add("Apples");

        System.out.println(list.get(1));
        list.set(1, "Grapes");
        System.out.println(list.get(1));
    }
}
