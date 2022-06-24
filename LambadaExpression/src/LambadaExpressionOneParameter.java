@FunctionalInterface
interface Sayable{
     String say2();
}
public class LambadaExpressionOneParameter {
    public static void main(String[] args) {
        Sayable obj=()->{
            return "Hello how are you";

        };
        System.out.println(obj.say2());
    }
}
