package Arrays;

import java.util.ArrayList;
import java.util.*;

import java.util.LinkedList;
import java.util.*;

import java.util.ArrayList;

class Queue {
    private ArrayList<Integer> list;

    // Constructor to initialize the queue
    public Queue() {
        list = new ArrayList<>();
    }

    // Enqueue: Adds an element to the end of the queue
    public void enqueue(int item) {
        list.add(item);
        System.out.println("Enqueued " + item);
    }

    // Dequeue: Removes an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = list.remove(0); // Remove the element at the front (index 0)
        System.out.println("Dequeued " + item);
        return item;
    }

    // Peek: Returns the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return list.get(0);
    }

    // Returns the size of the queue
    public int size() {
        return list.size();
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

public class QueueArrayList {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front element is: " + queue.peek());

        // Dequeue elements
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(6);

        System.out.println("Queue size is: " + queue.size());

        // Dequeue all elements
        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        // Trying to dequeue from an empty queue
        queue.dequeue();
    }
}
