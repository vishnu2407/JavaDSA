package DSA_JAVA_Concepts.Linear_DS.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues_java_Frameworks {
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Queue elements before removing: " + queue);
        System.out.println("Removing elements from the queue: ");

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();

        }
    }
}
