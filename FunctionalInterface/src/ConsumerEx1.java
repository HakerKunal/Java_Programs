import java.util.function.Consumer;

public class ConsumerEx1 {
    static void printMessage(String msg){
        System.out.println("Hello"+msg);
    }
    static void printValue(int val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        Consumer <String> consumer=ConsumerEx1::printMessage;
        consumer.accept("My Name is Kunal");
        Consumer <Integer> consumer2= ConsumerEx1::printValue;
        consumer2.accept(23);
    }
}
