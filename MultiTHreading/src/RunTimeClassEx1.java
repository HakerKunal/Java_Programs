public class RunTimeClassEx1 {
    public static void main(String[] args) {
        Runtime r1=Runtime.getRuntime();

        System.out.println("Free Memory is"+r1.freeMemory());
        for(int i=0;i<10000;i++){
            new RunTimeClassEx1();
        }
        System.out.println("After creating 10000 instance, Free Memory: "+r1.freeMemory());
        r1.gc();
        System.out.println("Memory after Clean up: "+r1.freeMemory());

    }
}
