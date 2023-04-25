import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a FIFOQUEUE and Stack
        Queue queue = new Queue();
        Stack stack = new Stack();
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            // Print menu options
            System.out.println("\nSelect an option:");
            System.out.println("1. Add item to Queue");
            System.out.println("2. Add item to Stack");
            System.out.println("3. Remove item from FIFOQUEUE");
            System.out.println("4. Remove item from Stack");
            System.out.println("5. Print FIFOQUEUE");
            System.out.println("6. Print Stack");
            System.out.println("7. Quit\n");
            
            // Get user input
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter item to add to FIFOQUEUE:");
                    String itemToAddToFifoQueue = scanner.next();
                    queue.enqueue(itemToAddToFifoQueue);
                    System.out.println("Item added to FIFOQUEUE.");
                    break;
                case 2:
                    System.out.print("Enter item to add to Stack:");
                    String itemToAddToStack = scanner.next();
                    stack.enqueue(itemToAddToStack);
                    System.out.println("Item added to Stack.");
                    break;
                case 3:
                    String itemRemovedFromFifoQueue = queue.dequeue();
                    System.out.println("Removed item from FIFOQUEUE: " + itemRemovedFromFifoQueue);
                    break;
                case 4:
                    String itemRemovedFromStack = stack.dequeue();
                    System.out.println("Removed item from Stack: " + itemRemovedFromStack);
                    break;
                case 5:
                    System.out.println("FIFOQUEUE: " + Arrays.toString(queue.getQueue()));
                    break;
                case 6:
                    System.out.println("Stack: " + Arrays.toString(stack.getQueue()));
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;
            }
        }
        
        scanner.close();
    }
}
