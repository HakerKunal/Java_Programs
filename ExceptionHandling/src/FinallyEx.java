public class FinallyEx {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block  will always run");
        }
    }
}
