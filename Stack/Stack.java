import java.util.Scanner;

class stackArray {
    int size = 10;
    int a[] = new int[size];
    int top = -1;

    void underFlow() {
        System.out.println("Nothing in Stack!");
    }

    void overFlow() {
        System.out.println("Stack Overflow!");
    }

    void push(int value) {
        if (top == a.length - 1) {
            overFlow();
        } else {
            top++;
            a[top] = value;
            System.out.println("Element Inserted: " + a[top]);
        }
    }

    void pop() {
        if (top == -1) {
            underFlow();
        } else {
            System.out.println("Element Deleted: " + a[top]);
            top--;
        }
    }

    void display() {
        if (top == -1) {
            underFlow();
            return;
        }
        System.out.println("Stack Elements:");
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i]);
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stackArray stack = new stackArray();

        int choice;
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
            scanner.close();
    }
}
