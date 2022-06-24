interface Doable{

    default void doIt(){
        System.out.println("Do it");
    }
}
@FunctionalInterface
interface Sayable extends Doable{
    public void say(String str);
}
public class ExtendingNonFunctionInterface implements  Sayable{
    @Override
    public void say(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        ExtendingNonFunctionInterface obj =new ExtendingNonFunctionInterface();
        obj.say("Hello there");
        obj.doIt();
    }
}
