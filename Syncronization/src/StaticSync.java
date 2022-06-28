class Table3 {

    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }

}


public class StaticSync {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                Table3.printTable(2);
            }
        };
        Thread t2 =new Thread(){
            public void run(){
                Table3.printTable(4);
            }
        };
        Thread t3=new Thread(){
            public void run(){
                Table3.printTable(5);
            }
        };
        Thread t4=new Thread(){
            public void run (){
                Table3.printTable(10);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
