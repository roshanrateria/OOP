public class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a maximum size
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Method to push element onto the stack
    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow. Cannot push element " + element);
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed " + element + " onto the stack");
        }
    }

    // Method to pop element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. Cannot pop element from empty stack");
            return -1; // or throw an exception
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped " + poppedElement + " from the stack");
            return poppedElement;
        }
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. No element to peek");
            return -1; // or throw an exception
        } else {
            System.out.println("Top element of the stack is: " + stackArray[top]);
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack with maximum size 5
        stack.push(10); // Pushing elements onto the stack
        stack.push(20);
        stack.push(30);
        stack.peek(); // Peeking the top element
        stack.pop(); // Popping element from the stack
        stack.peek(); // Peeking again after pop
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    }
}
