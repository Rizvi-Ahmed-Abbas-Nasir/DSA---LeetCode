public class linkedlist{



 static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

  static class LinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
    }

    Node getNodeAt(int index) {
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        return current; 
    }

    void addNodeValueTo(int indexFrom, int indexTo) {
        Node fromNode = getNodeAt(indexFrom);
        Node toNode = getNodeAt(indexTo);

        if (fromNode != null && toNode != null) {
            toNode.data += fromNode.data;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}



 static class TestNode {
    int data;
    TestNode next;

    TestNode(int data) {
        this.data = data;
        this.next = null;
    }
    TestNode(int data, TestNode next) {
        this.data = data;
        this.next = next;
    }
}

public static void main(String[] args) {
 LinkedList list = new LinkedList();
list.add(10); 

list.printList();

TestNode test = new TestNode(0);
TestNode test2 = new TestNode(20, test);


System.err.println(test2.next.data);
   
}




}