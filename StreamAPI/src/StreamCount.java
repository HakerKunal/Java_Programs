import java.util.ArrayList;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {
        List<Product> list =new ArrayList<Product>();
        list.add(new Product(1,"mango",200));
        list.add(new Product(2,"banana",40));
        list.add(new Product(3,"apple",120));
        list.add(new Product(4,"guava",110));
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
        long count=list.stream().filter(p->p.price>111).count();
        System.out.println("Product whose price greater than rs 111- "+count);
    }
}
