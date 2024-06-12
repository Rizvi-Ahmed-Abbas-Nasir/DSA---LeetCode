class Node:
    def __init__(self, data=0, next=None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    def insertAtEnd(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        current_node = self.head
        while current_node.next:
            current_node = current_node.next
        current_node.next = new_node

    def printLL(self):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" -> ")
            current_node = current_node.next
        print("None")

    def InputFromNode(self, data):
        for i in data:
            new_node = Node(i)
            if self.head is None:
                self.head = new_node
            else:
                temp = self.head
                while temp.next is not None:
                    temp = temp.next
                temp.next = new_node

def AddTwoNumber(l1: Node, l2: Node) -> Node:
    dummy = Node(0)
    curr = dummy
    carry = 0
    
    while l1 or l2 or carry:
        v1 = l1.data if l1 else 0
        v2 = l2.data if l2 else 0
        val = v1 + v2 + carry
        carry = val // 10
        val = val % 10
        curr.next = Node(val)
        curr = curr.next
        l1 = l1.next if l1 else None
        l2 = l2.next if l2 else None
    
    return dummy.next

class Main:
    def Result(self):
        # Create two linked lists
        llist0 = LinkedList()
        llist1 = LinkedList()

        # Add nodes to the linked lists
        llist0.insertAtEnd(2)
        llist0.insertAtEnd(4)
        llist0.insertAtEnd(3)
        
        llist1.insertAtEnd(5)
        llist1.insertAtEnd(6)
        llist1.insertAtEnd(4)
        
        # Adding the two numbers
        resultNode = AddTwoNumber(llist0.head, llist1.head)
        
        # Create a linked list for the result
        llist2 = LinkedList()
        llist2.head = resultNode

        # Print the result linked list
        llist2.printLL()

        # Print the original linked lists
        print("Linked list 1:")
        llist0.printLL()
        print("Linked list 2:")
        llist1.printLL()

if __name__ == "__main__":
    m = Main()
    m.Result()
