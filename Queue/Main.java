class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    // Enqueue operation to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue operation to remove an element from the queue
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued element: " + temp.data);
    }

    // Print the elements of the queue
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements to the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Print the elements of the queue
        System.out.println("Queue elements:");
        queue.display();

        // Dequeue elements from the queue
        queue.dequeue();
        queue.dequeue();

        // Print the elements of the queue after dequeue operations
        System.out.println("Queue elements after dequeue operations:");
        queue.display();
    }
}
