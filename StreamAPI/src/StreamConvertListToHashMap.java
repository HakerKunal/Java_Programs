import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamConvertListToHashMap {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "mango", 200));
        list.add(new Product(2, "banana", 40));
        list.add(new Product(3, "apple", 120));
        list.add(new Product(4, "guava", 110));
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        Map<Integer,String> map=list.stream().collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println(map);

    }
}
