import java.util.HashMap;
import java.util.Map;

public class HashMapCompareByKey {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(4,"Four");
        map.put(2,"Two");
        map.put(3,"Three");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
