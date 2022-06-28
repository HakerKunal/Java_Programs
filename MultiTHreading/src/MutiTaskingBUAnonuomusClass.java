public class MutiTaskingBUAnonuomusClass extends Thread{
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                System.out.println("Thread one");
            }
        };
        Thread t2=new Thread(){
            public void run(){
                System.out.println("Thread two");
            }
        };
        t1.start();
        t2.start();
    }
}
