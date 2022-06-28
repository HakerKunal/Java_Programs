public class ThreadGroupDestroy {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");

        th1.join();
        th2.join();

        tg1.destroy();
        System.out.println(tg1.getName() + " is destroyed.");

        tg.destroy();
        System.out.println(tg.getName() + " is destroyed.");
    }
}
