public class ThreadByImplementingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadByThreadClass t1=new ThreadByThreadClass();
        Thread thread=new Thread(t1);
        thread.start();
    }
}
