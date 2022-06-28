public class ThreadPriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(6);
        t2.setPriority(3);
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());

        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

    }
}
