import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapCompareByValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"b");
        map.put(3,"c");
        map.put(1,"a");
        map.put(4,"d");
        map.put(6,"e");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
