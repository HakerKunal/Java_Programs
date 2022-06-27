import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapCompareByKeyReverseOrder {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"Two");
        map.put(1,"One");
        map.put(3,"Three");
        map.put(5,"Five");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(n-> System.out.println(n));
    }
}
