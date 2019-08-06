package challenges;

// What does this stack do?
public class Stack {

    // Hold the stack array.
    private Object array[];

    // Hold the top element in the array.
    private int head;

    // Hold the size limit of the array.
    private int capacity;

    // Construct the stack array when a new stack is generated.
    Stack(int capacity) {
        // Constructor takes in the size of the array to be generated and creates an Object array of that size.
        this.array = new Object[capacity];
        // Set capacity equal to the size of the array.
        this.capacity = capacity;
        // We haven't hit the zeroth element yet until the first element is pushed into the array.
        this.head = -1;
    }


    public void push(Object item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        // Set item to the element in front of the head element, and increment head by one.
        array[++head] = item;
    }

    public Object peak() {
        return array[head];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // Lower the head element by 1.
        return array[head--];
    }

    private boolean isEmpty() {
        return head == -1;
    }

    private boolean isFull() {
        return head == capacity - 1;
    }
}
