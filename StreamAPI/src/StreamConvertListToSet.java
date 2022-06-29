import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamConvertListToSet {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<Product>();
        list.add(new Product(1,"mango",200));
        list.add(new Product(2,"banana",40));
        list.add(new Product(3,"apple",120));
        list.add(new Product(4,"guava",110));
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

        Set<Float> set=list.stream().filter(p->p.price>111).map(p->p.price).collect(Collectors.toSet());

        System.out.println(set);

    }
}
