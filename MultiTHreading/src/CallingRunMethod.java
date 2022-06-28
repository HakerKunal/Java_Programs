public class CallingRunMethod extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        CallingRunMethod t1=new CallingRunMethod();
        CallingRunMethod t2=new CallingRunMethod();

        t1.run();
        t2.run();
    }
}
