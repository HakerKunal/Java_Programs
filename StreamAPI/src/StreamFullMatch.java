import java.util.ArrayList;
import java.util.List;

public class StreamFullMatch {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "mango", 200));
        list.add(new Product(2, "banana", 40));
        list.add(new Product(3, "apple", 120));
        list.add(new Product(4, "guava", 110));
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        boolean result=list.stream().allMatch(p->p.price>30);
        System.out.println(result);

        boolean result2=list.stream().allMatch(p->p.price>55);
        System.out.println(result2);
    }
}
