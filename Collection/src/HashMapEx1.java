import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        System.out.println(map);

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getValue()+"  "+m.getKey());
        }
    }
}
