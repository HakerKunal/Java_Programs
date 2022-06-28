public class ThreadByThreadClass extends  Thread{
    public void run (){
        System.out.println("Thread 1 is running");
    }
    public static void main(String[] args) {
        ThreadByThreadClass t1=new ThreadByThreadClass();
        t1.start();
    }
}
