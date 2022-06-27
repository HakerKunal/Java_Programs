import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Guava");
        list.add("Apples");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("Apples");
        System.out.println(list);


        ArrayList<String> list2=new ArrayList<String>();
        list.add("Kunal");
        list.add("Rahul");
        list.add("Ankit");

        list.addAll(list2);
        System.out.println(list);

        list.removeIf((str)->str.contains("Ankit"));  //Using Lambda Expression.
        System.out.println(list);
    }
}
