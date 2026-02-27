// Stack Interface
interface Stack {
    int size = 5;   // fixed size

    void push(int data);
    void pop();
    void display();
    void overflow();
    void underflow();
}

// IntegerStack Class
class IntegerStack implements Stack {
    int arr[] = new int[size];
    int top = -1;

    public void push(int data) {
        if (top == size - 1) {
            overflow();
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed");
        }
    }

    public void pop() {
        if (top == -1) {
            underflow();
        } else {
            System.out.println(arr[top--] + " popped");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow");
    }

    public void underflow() {
        System.out.println("Stack Underflow");
    }
}

// Test Class
public class StackTest {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}