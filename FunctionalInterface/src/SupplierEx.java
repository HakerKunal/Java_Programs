import java.util.function.Supplier;

public class SupplierEx {
    static int getRandomNumber(){
        int random=(int)(Math.random()*100)+1;
        return random;
    }
    public static void main(String[] args) {
        Supplier<Integer> sup=()->{
           return  getRandomNumber();
        };
        System.out.println(sup.get());


    }
}
