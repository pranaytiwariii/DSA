class stacks{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        MyStack stack = new MyStack(5);

        stack.push(1);

        stack.push(2);

        stack.push(3);

        System.out.print("Stack: ");

        stack.printStack();

        stack.pop();

        System.out.println("\nAfter poppingout");

        stack.printStack();
            }
        }

class MyStack{
   private int arr[];
    private int top;
    private int capacity;

    MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void printStack() {
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]+",");
        }
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        System.out.println("Pushing " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

}