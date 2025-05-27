public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Queue underflow");
            return -1; // or throw an exception
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // If the queue is now empty
        }
        return value;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
