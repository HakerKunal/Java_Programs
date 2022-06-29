
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamEx1 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "books", 250.00f));
        list.add(new Product(2, "Mango", 100.00f));
        list.add(new Product(3, "computer", 1000.0f));
        list.add(new Product(4, "laptop", 330.0f));
        list.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList=  list.stream().filter(p->p.price>200).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPriceList);
    }
}
