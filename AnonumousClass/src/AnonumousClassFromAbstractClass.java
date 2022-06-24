abstract class Person {
    abstract void message();

}

public class AnonumousClassFromAbstractClass {
    public static void main(String[] args) {
        Person p =new Person() {

            void message() {
                System.out.println("Hello Inner Class");
            }
        };
        p.message();
    }

}
