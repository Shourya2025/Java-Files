package Learning;

class StackOverFlowException extends Exception {
    public String toString() {
        return "The stack is full, can't add more values.";
    }
}

class StackUnderFlowException extends Exception {
    public String toString() {
        return "The stack is empty, can't delete more values.";
    }
}

class Stack {
    private int size;
    private int top = -1;
    private int[] s;

    // Constructor with proper naming and no return type
    public Stack(int sz) {
        size = sz;
        s = new int[sz];
    }

    public void push(int x) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException();
        }
        s[++top] = x;
    }

    public void pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }
        int x = s[top--];
        System.out.println("Popped: " + x);
    }
}

public class StudentChallengeExceptionHnadling {
    public static void main(String[] args) {
        Stack s = new Stack(5);  // Specify size here

        try {
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60); // Will throw overflow
        } catch (StackOverFlowException e) {
            System.out.println(e);
        }

        try {
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop(); // Will throw underflow
        } catch (StackUnderFlowException e) {
            System.out.println(e);
        }
    }
}
