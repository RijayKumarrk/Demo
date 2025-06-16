// Node class for singly linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using singly linked list
public class Stack {
    private Node top;  // Points to the top of the stack

    public Stack() {
        this.top = null;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  // New node points to the current top
        top = newNode;       // Update top to the new node
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow - cannot pop from an empty stack");
        }
        int poppedData = top.data;
        top = top.next;  // Move top to the next node
        return poppedData;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty - cannot peek");
        }
        return top.data;
    }

    // Display stack contents (top to bottom)
    public void display() {
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Output: Stack (top to bottom): 30 20 10

        System.out.println("Popped: " + stack.pop());  // Output: 30
        System.out.println("Peek: " + stack.peek());   // Output: 20
        stack.display();                               // Output: Stack (top to bottom): 20 10
    }
}
