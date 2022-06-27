import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Guava");
        list.add("Apples");

        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> intList=new ArrayList<Integer>();
        intList.add(1);
        intList.add(99);
        intList.add(24);
        intList.add(0);
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);


        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Mango");
        list2.add("Banana");
        list2.add("Guava");
        list2.add("Apples");
        System.out.println(list2);
        list2.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

    }
}
