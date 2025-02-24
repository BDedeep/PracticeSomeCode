package stackSolution;

public class StackTest {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackTest(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; // Indicates an empty stack
    }

    // Push operation: Adds an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot add " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop operation: Removes and returns the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1;
        }
        System.out.println("Popped: " + stack[top]);
        return stack[top--];
    }

    // Peek operation: Returns the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    // Display the elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack
    public static void main(String[] args) {
        StackTest stack = new StackTest(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();

        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}
