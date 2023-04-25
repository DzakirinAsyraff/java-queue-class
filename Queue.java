public class Queue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        queue = new String[10];
        front = 0;
        rear = -1;
        size = 0;
    }

    public String[] enqueue(String value) {
        if (rear == queue.length - 1) {
            String[] newQueue = new String[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }
        rear++;
        queue[rear] = value;
        size++;
        return queue;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String value = queue[front];
        front++;
        size--;
        return value;
    }

    public String[] getQueue() {
        String[] values = new String[size];
        System.arraycopy(queue, front, values, 0, size);
        return values;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
