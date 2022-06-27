import java.util.PriorityQueue;

public class PrirotyQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        System.out.println(queue);
        System.out.println("Head--"+queue.peek());
        System.out.println("Head--"+queue.element());
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}
