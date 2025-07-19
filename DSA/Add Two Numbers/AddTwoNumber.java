class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to add a node at the end of the linked list
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
}

class Solution {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null) ? l1.data : 0;
            int v2 = (l2 != null) ? l2.data : 0;

            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            current.next = new Node(sum);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}

public class AddTwoNumber {
    public static void main(String[] args) {
        // Create two linked lists
        LinkedList llist0 = new LinkedList();
        LinkedList llist1 = new LinkedList();

        // Add nodes to the linked lists
        llist0.insertAtEnd(2);
        llist0.insertAtEnd(4);
        llist0.insertAtEnd(3);

        llist1.insertAtEnd(5);
        llist1.insertAtEnd(6);
        llist1.insertAtEnd(4);

        // Adding the two numbers
        Solution solution = new Solution();
        Node resultNode = solution.addTwoNumbers(llist0.head, llist1.head);

        // Create a linked list for the result
        LinkedList llist2 = new LinkedList();
        llist2.head = resultNode;

        // Print the result linked list
        System.out.println("Result Linked List:");
        llist2.printLL();

        // Print the original linked lists
        System.out.println("Linked list 1:");
        llist0.printLL();

        System.out.println("Linked list 2:");
        llist1.printLL();
    }
}
