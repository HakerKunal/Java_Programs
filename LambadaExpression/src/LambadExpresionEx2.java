@FunctionalInterface
interface Shape2 {
    int operation2(int a, int b);
}

public class LambadExpresionEx2 {
    public static void main(String[] args) {
        Shape2 s1 = (a, b) -> a + b;
        System.out.print("Addition-->");
        System.out.println(s1.operation2(2, 4));
        Shape2 s2 = (a, b) -> a * b;
        System.out.print("Multiplication-->");
        System.out.println(s2.operation2(3, 5));
    }
}
