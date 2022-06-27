import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Kunal");
        list.add("Rahul");
        list.add("Ankit");

        System.out.println(list);
        for (String item:list){
            System.out.println(item);
        }
    }
}
