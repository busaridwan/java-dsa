package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Person one");
        queue.offer("Person two");
        queue.offer("person three");
        System.out.println(queue);
        // .peek()
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        Queue<String> pueue = new PriorityQueue<>(); //Alphabetically
        pueue.offer("name one");
        pueue.offer("name two");
        pueue.offer("name three");
        System.out.println(pueue);
        pueue.poll();
        System.out.println(pueue);
        pueue.poll();
        System.out.println(pueue);
    }
}
