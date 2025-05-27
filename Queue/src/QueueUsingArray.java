public class QueueUsingArray {
    private int size;
    private int rear;
    private int front;
    private int[] queue;

    public QueueUsingArray(int size, int rear, int front, int[] queue) {
        this.size = size;
        this.rear = rear;
        this.front = front;
        this.queue = queue;
    }

    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    // Insertion
    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Overflow");
        } else {
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else if (rear == size - 1 && front != 0) {
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = data;
        }
    }

    // Deletion
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return -1;
        } else {
            int data = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
            return data;
        }
    }
}
