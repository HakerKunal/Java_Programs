public class ThrowEx1 {
    public void validateAge(int age){
        if (age<18){
            throw new ArithmeticException("Person Not Eligible for Subscription");
        }
        else{
            System.out.println("Person in Eligible");
        }
    }

    public static void main(String[] args) {
        ThrowEx1 obj=new ThrowEx1();
        try {
            obj.validateAge(13);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
