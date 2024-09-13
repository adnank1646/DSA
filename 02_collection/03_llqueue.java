import java.util.Queue;
import java.util.LinkedList;

public class llqueue {
    public static void main(String[] args) {
        
//WORKS ON FIFO
        Queue<Integer> queue = new LinkedList<>();
        //to add element in the queue
        queue.offer(15);
        queue.offer(85);
        queue.offer(56);

        System.out.println(queue);


        //to Remove element fom queue
        System.out.println(queue.poll());
        System.out.println(queue);

        //to see who next
        System.out.println(queue.peek());

    }
}