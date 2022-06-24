public class ExceptionOveriding5 extends Motor{
    void method()throws ArithmeticException{
        System.out.println("Child Method");
    }
    public static void main(String[] args) {
        try{
            Motor obj=new ExceptionOveriding5();
            obj.method();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
