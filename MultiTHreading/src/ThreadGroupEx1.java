import java.util.SortedMap;

public class ThreadGroupEx1 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread name= "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupEx1 runnable= new ThreadGroupEx1();
        ThreadGroup tg1=new ThreadGroup("Group 1");

        Thread t1=new Thread(tg1,runnable,"one");
        t1.start();
        Thread t2=new Thread(tg1,runnable,"two");
        t2.start();
        Thread t3=new Thread(tg1,runnable,"three");
        t3.start();
        System.out.println("Thread Group Name: "+tg1.getName());
        tg1.list();
        System.out.println(tg1.activeCount());

    }
}
