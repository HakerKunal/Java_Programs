@FunctionalInterface
interface Drawable{
    void draw();
}
public class LambadaExample1{
    public static void main(String[] args) {
        int width=10;
        Drawable d1=()->{
            System.out.println("Drawing "+ width);
        };
        d1.draw();
    }
}
