import java.util.Scanner;

public class StackQueue {

    int stack[] = new int[5];
    int top = -1;

    int queue[] = new int[5];
    int front = 0, rear = -1;

    // Stack push
    void push(int x) {
        if (top == 4)
            System.out.println("Stack Overflow");
        else {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    // Stack pop
    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println(stack[top--] + " popped from stack");
    }

    // Queue insert
    void insert(int x) {
        if (rear == 4)
            System.out.println("Queue Overflow");
        else {
            queue[++rear] = x;
            System.out.println(x + " inserted into queue");
        }
    }

    // Queue delete
    void delete() {
        if (front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println(queue[front++] + " deleted from queue");
    }

    public static void main(String args[]) {

        StackQueue sq = new StackQueue();
        Scanner sc = new Scanner(System.in);

        sq.push(10);
        sq.push(20);
        sq.pop();

        sq.insert(30);
        sq.insert(40);
        sq.delete();

        sc.close();
    }
}