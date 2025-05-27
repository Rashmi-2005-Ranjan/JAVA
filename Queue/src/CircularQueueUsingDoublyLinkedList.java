public class CircularQueueUsingDoublyLinkedList {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public CircularQueueUsingDoublyLinkedList() {
        front = null;
        rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = rear = newNode;
            front.next = rear;
            rear.prev = front;
            front.prev = rear; // Circular link
            rear.next = front; // Circular link
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            newNode.next = front; // Circular link
            front.prev = newNode; // Circular link
            rear = newNode;
        }
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Queue underflow");
            return -1; // or throw an exception
        }
        int value = front.data;
        if (front == rear) { // Only one element
            front = rear = null;
        } else {
            front = front.next;
            front.prev = rear; // Maintain circular link
            rear.next = front; // Maintain circular link
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
        if (front == null) return 0;

        int count = 0;
        Node current = front;
        do {
            count++;
            current = current.next;
        } while (current != front);

        return count;
    }
}
