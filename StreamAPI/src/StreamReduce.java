import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenovo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        Float total = productsList.stream().map(p -> p.price).reduce(0.0f, (sum, price) -> sum + price);
        System.out.println(total);

    }
}
