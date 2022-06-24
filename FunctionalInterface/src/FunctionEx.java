import java.util.function.Function;

public class FunctionEx {
    static double getRandom(int a){
        return Math.random()*a;
    }
    public static void main(String[] args) {
        Function<Integer,Double> fun=(a)->{
            return getRandom(a);
        };
        System.out.println(fun.apply(23));
    }
}
