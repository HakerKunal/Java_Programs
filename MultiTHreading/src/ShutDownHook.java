public class ShutDownHook extends Thread{
    public void run(){
        System.out.println("Shutdown Hook code running");
    }

    public static void main(String[] args) {
        Runtime  runtime=Runtime.getRuntime();
        runtime.addShutdownHook(new ShutDownHook());
        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{Thread.sleep(3000);}catch (Exception e) {}
    }
}
