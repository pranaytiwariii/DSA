class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Insertion at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Deletion by value
    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        // If the key is found at the head
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If the key was not found
        if (temp == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node from the list
        prev.next = temp.next;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class deletion {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insertion at the beginning
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        // Insertion at the end
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);

        // Print original linked list
        System.out.println("Original Linked List: ");
        linkedList.printList();

        // Delete a node by value (e.g., delete node with data=3)
        linkedList.deleteNode(3);

        // Print linked list after deletion
        System.out.println("Linked List after deletion: ");
        linkedList.printList();
    }
}
