class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        if (last.prev != null) {
            last.prev.next = null;
        } else {
            head = null;
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dbl = new DoublyLinkedList();

        dbl.insertFront(1);
        dbl.insertFront(2);
        dbl.insertEnd(3);
        dbl.insertEnd(4);

        System.out.println("Display Forward:");
        dbl.displayForward();

        System.out.println("Display Backward:");
        dbl.displayBackward(); 

        dbl.deleteFront();
        System.out.println("After deleting front:");
        dbl.displayForward(); 

        dbl.deleteEnd();
        System.out.println("After deleting end:");
        dbl.displayForward(); 
    }
}
