public class FinallyEx2 {
    public static void main(String[] args) {
        try {
            String str=null;
            str.length();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("I will  always run ");
        }
    }
}
