@FunctionalInterface
interface sayable {
    void say(String msg);

}


public class FunctionalInterfaceEx1 implements sayable{
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceEx1 obj = new FunctionalInterfaceEx1();
        obj.say("Hello hi everyone");
    }
}
