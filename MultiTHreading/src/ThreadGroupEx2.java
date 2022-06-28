class ThreadNew extends Thread {

    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }


    public void run() {

        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }

        }

        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}


public class ThreadGroupEx2 extends Thread {

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("The parent group of threads");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");
    ThreadNew t1=new ThreadNew("first",tg);
        System.out.println("Starting the first");
        ThreadNew th2 = new ThreadNew("the second", tg);
        System.out.println("Starting the second");


        System.out.println("The total number of active thread groups are: " + tg.activeGroupCount());

    }
}
