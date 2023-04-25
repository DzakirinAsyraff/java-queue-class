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
            System.arraycopy(stack, 0, newStack, 0, stack.length);
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
        System.arraycopy(stack, 0, values, 0, size);
        return values;
    }

    // b.
    // public String[] enqueue(String value) {
    //     if (size == stack.length) {
    //         String[] newStack = new String[2 * stack.length];
    //         for (int i = 0; i < stack.length; i++) {
    //             newStack[i] = stack[i];
    //         }
    //         stack = newStack;
    //     }
    //     top++;
    //     stack[top] = value;
    //     size++;
    //     String[] newStack = new String[size];
    //     for (int i = 0; i < size; i++) {
    //         newStack[i] = stack[i];
    //     }
    //     return newStack;
    // }
    // 
    // public String dequeue() {
    //     if (size == 0) {
    //         throw new IllegalStateException("Queue is empty");
    //     }
    //     String value = stack[top];
    //     top--;
    //     size--;
    //     return value;
    // }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
