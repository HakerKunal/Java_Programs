public class ThreadByThreadConstructor {
    public static void main(String[] args) {
        Thread t2=new Thread("Hi thread is running");
        t2.start();

        String str = t2.getName();
        System.out.println(str);

    }
}
