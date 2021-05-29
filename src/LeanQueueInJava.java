import java.util.LinkedList;
import java.util.Queue;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class LeanQueueInJava {
    public static void main(String[] args) {
        /**
         * Queue = FIFO data structure, First-In First Out (ex. A line of people)
         * A collection designed for holding elements prior to processing
         * Linear data structure
         *
         * add = enqueue, offer()
         * remove = dequeue, poll()
         */
        Queue<String> queue = new LinkedList<>();

        

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.contains("Harold"));

        //System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

        /**
         * Where are queues useful?
         * 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
         * 2. Printer Queue (Print jobs should be completed in order)
         * 3. Used in LinkedLists, Priority Queues, Breadth-first search
         */
    }
}
