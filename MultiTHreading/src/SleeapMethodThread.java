public class SleeapMethodThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleeapMethodThread t1=new SleeapMethodThread();
        SleeapMethodThread t2=new SleeapMethodThread();

        t1.start();
        t2.start();
    }
}
