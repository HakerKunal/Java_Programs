public class NamingThread extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        NamingThread t1=new NamingThread();
        NamingThread t2=new NamingThread();
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        t2.start();

        t1.setName("My Thread No.1");
        t2.setName("My Thread No. 1");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
