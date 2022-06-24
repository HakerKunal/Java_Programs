public class MultipleTryAndCatch {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3};
            System.out.println(a[10]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Parent Exception");
        }

    }
}
