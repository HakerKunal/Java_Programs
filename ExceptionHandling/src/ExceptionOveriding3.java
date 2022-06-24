class Parent2 {
    //    If the superclass method declares an exception, subclass overridden method can declare the same subclass exception or no exception but cannot declare parent exception.
    void message() throws ArithmeticException {
        System.out.println("Parent Message");

    }

}

public class ExceptionOveriding3 extends Parent2 {
//    void message() throws Exception {
//        System.out.println("Child Method");
//    }

    public static void main(String[] args) {
        Parent2 obj=new ExceptionOveriding3();
        obj.message();

    }

}
