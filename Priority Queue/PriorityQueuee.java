import java.util.PriorityQueue;

public class PriorityQueuee {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        // Inserting elements into the priority queue
        priorityQueue.offer(new Task("Task A", 5));
        priorityQueue.offer(new Task("Task B", 3));

        // Performing operations on the priority queue
        System.out.println("Peek: " + priorityQueue.peek()); // Check the element with the highest priority
        System.out.println("Priority Queue after peek: " + priorityQueue);

        System.out.println("Dequeue: " + priorityQueue.poll()); // Remove the element with the highest priority
        System.out.println("Priority Queue after dequeue: " + priorityQueue);

        // Inserting a new element
        priorityQueue.offer(new Task("Task F", 1));
        System.out.println("Priority Queue after insertion: " + priorityQueue);
    }
}

// Class representing a task with name and priority
class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Compare tasks based on their priority
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Priority: " + priority;
    }
}
