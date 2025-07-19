class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    // Method to add a node at the end of the linked list
    insertAtEnd(data) {
        const newNode = new Node(data);
        if (!this.head) {
            this.head = newNode;
        } else {
            let current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    printLL() {
        let current = this.head;
        let output = '';
        while (current) {
            output += `${current.data} -> `;
            current = current.next;
        }
        console.log(output + 'None');
    }
}

function addTwoNumbers(l1, l2) {
    const dummy = new Node(0);
    let current = dummy;
    let carry = 0;

    while (l1 || l2 || carry) {
        const v1 = l1 ? l1.data : 0;
        const v2 = l2 ? l2.data : 0;

        const sum = v1 + v2 + carry;
        carry = Math.floor(sum / 10);
        const val = sum % 10;

        current.next = new Node(val);
        current = current.next;

        l1 = l1 ? l1.next : null;
        l2 = l2 ? l2.next : null;
    }

    return dummy.next;
}

// Main function
function main() {
    // Create two linked lists
    const llist0 = new LinkedList();
    const llist1 = new LinkedList();

    // Add nodes to the linked lists
    llist0.insertAtEnd(2);
    llist0.insertAtEnd(4);
    llist0.insertAtEnd(3);

    llist1.insertAtEnd(5);
    llist1.insertAtEnd(6);
    llist1.insertAtEnd(4);

    // Adding the two numbers
    const resultNode = addTwoNumbers(llist0.head, llist1.head);

    // Create a linked list for the result
    const llist2 = new LinkedList();
    llist2.head = resultNode;

    // Print the result linked list
    console.log("Result Linked List:");
    llist2.printLL();

    // Print the original linked lists
    console.log("Linked list 1:");
    llist0.printLL();

    console.log("Linked list 2:");
    llist1.printLL();
}

// Call the main function
main();
