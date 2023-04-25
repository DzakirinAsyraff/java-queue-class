public class Stack {
    private String[] stack;
    private int top;
    private int size;

    public Stack() {
        stack = new String[10];
        top = -1;
        size = 0;
    }

    public String[] enqueue(String value) {
        if (top == stack.length - 1) {
            String[] newStack = new String[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        top++;
        stack[top] = value;
        size++;
        return stack;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String value = stack[top];
        top--;
        size--;
        return value;
    }

    public String[] getQueue() {
        String[] values = new String[size];
        for (int i = 0; i < size; i++) {
            values[i] = stack[i];
        }
        return values;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
