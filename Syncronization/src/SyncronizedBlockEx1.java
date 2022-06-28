class Table2 {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + "*" + i + "=" + n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

class myThread3 extends Thread {
    Table2 t;

    myThread3(Table2 t) {
        this.t = t;

    }

    public void run() {
        t.printTable(3);
    }
}

class myThread4 extends Thread {
    Table2 t;

    myThread4(Table2 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class SyncronizedBlockEx1 {
    public static void main(String[] args) {
        Table2 obj = new Table2();
        myThread3 t1 = new myThread3(obj);
        myThread4 t2 = new myThread4(obj);

        t1.start();
        t2.start();
    }
}
