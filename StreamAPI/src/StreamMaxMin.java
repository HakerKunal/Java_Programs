import java.util.ArrayList;
import java.util.List;

public class StreamMaxMin {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<Product>();
        list.add(new Product(1,"mango",200));
        list.add(new Product(2,"banana",40));
        list.add(new Product(3,"apple",120));
        list.add(new Product(4,"guava",110));
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

        Product max=list.stream().max((o1, o2) -> o1.price> o2.price?1:-1).get();
        System.out.println("Maximum priced product- "+max.name);

        Product min=list.stream().min(((o1, o2) -> o1.price>o2.price?1:-1)).get();
        System.out.println("Minimum priced Product- "+min.name);


    }
}
