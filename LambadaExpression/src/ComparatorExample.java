import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Product> listOfProduct = new ArrayList<Product>();
        listOfProduct.add(new Product(3, "Shirt", 2000));
        listOfProduct.add(new Product(1, "Pant", 1400));
        listOfProduct.add(new Product(2, "Cap", 200f));
        Collections.sort(listOfProduct,(p1,p2)->{
            return p1.name.compareTo(p2.name);

        });
      for (Product p :listOfProduct){
          System.out.println(p.id+" "+p.name+" "+p.price);
      }


    }

}
