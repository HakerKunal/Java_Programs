class Vehicle{
    void message()
    {
        System.out.println("Parent Method");
    }
}


public class ExceptionOveriding2 extends Vehicle{
    void message() throws ArithmeticException{
        System.out.println("Child method ");
    }

    public static void main(String[] args) {
        Vehicle obj=new ExceptionOveriding2();
                obj.message();
    }
}
