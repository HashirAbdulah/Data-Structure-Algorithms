class Node{
    int data;
    Node next;

    Node(int data){
    this.data = data;
    this.next = null;
    }
}
 public class linklist {
    Node head;
    Node tail;

    linklist(){
        this.head = null;
        this.tail = null;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void showNode() {
        Node current = head;
        while (current != null) {
            System.out.println("The data is " + current.data);
            current = current.next;
        }
    }

    public void delete(int data) {
        if (head == null) {
              return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void update(int oldData, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == oldData) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
        System.out.println("Data not found");
    }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Linked List:");
        list.showNode();
        list.delete(4);
        System.out.println("Deleted List:");
        list.showNode();
        list.update(2, 5);
        System.out.println("Updated List:");
        list.showNode();
        
    }
 }
 
