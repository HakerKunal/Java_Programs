class Simple1 extends Thread{
    public void run(){
        System.out.println("Thread one is running");
    }
}
class Simple2 extends  Thread{
    public void run(){
        System.out.println("Thread Two is Running");
    }
}

public class MultiTaskingEx1 {
    public static void main(String[] args) {
        Simple1 t1=new Simple1();
        Simple2 t2=new Simple2();

        t1.start();
        t2.start();
    }
}
