public class NullPointerException {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (java.lang.NullPointerException e){
            System.out.println(e);
        }

    }
}
