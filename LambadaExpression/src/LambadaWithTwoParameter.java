@FunctionalInterface
interface Reactange{
    int square(int a,int b);
}

public class LambadaWithTwoParameter {
    public static void main(String[] args) {
        Reactange rt=(a,b)->{
            return a*b;
        };
        System.out.println(rt.square(2,3));
    }
}

