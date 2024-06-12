#include<stdio.h>
#include<vector>
#include<iostream>
#include <assert.h>
#include <bits/stdc++.h>
using namespace std;


// class ListNode1 {
// public:
//     int data;
//     ListNode1* next;
    
    
// };


// struct ListNode1{
//     public:
//     int data;
//     ListNode1 *next;
// };

struct ListNode1 {
     int data;
     ListNode1 *next;
     ListNode1() : data(0), next(nullptr) {}
     ListNode1(int x) : data(x), next(nullptr) {}
     ListNode1(int x, ListNode1 *next) : data(x), next(next) {}
 };

void push(ListNode1** head_ref, int new_data){
    ListNode1* new_Node = new ListNode1();
    new_Node->data = new_data;
    new_Node->next = (*head_ref);
    (*head_ref) = new_Node;


}

void insertAfter(ListNode1* prev_node,  int new_data){  
    /* 1. Check if the given prev_node  
          is NULL */
    if (prev_node == NULL)  
    {  
        cout << "the given previous node cannot be NULL";  
        return;  
    }  
  
    // 2. Allocate new node  
    ListNode1* new_node = new ListNode1(); 
  
    // 3. Put in the data  
    new_node->data = new_data;  
  
    // 4. Make next of new node as next  
    //    of prev_node  
    new_node->next = prev_node->next;  
  
    // 5. Move the next of prev_node  
    //    as new_node  
    prev_node->next = new_node;  
}  
  
/* Given a reference (pointer to pointer)  
   to the head of a list and an int,  
   appends a new node at the end */
void append(ListNode1** head_ref, int new_data)  
{  
    // 1. Allocate node  
    ListNode1* new_node = new ListNode1(); 
  
    // Used in step 5 
    ListNode1 *last = *head_ref;  
  
    // 2. Put in the data  
    new_node->data = new_data;  
  
    /* 3. This new node is going to be  
          the last node, so make next of  
          it as NULL */
    new_node->next = NULL;  
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if (*head_ref == NULL)  
    {  
        *head_ref = new_node;  
        return;  
    }  
  
    // 5. Else traverse till the 
    //    last node  
    while (last->next != NULL)  
        last = last->next;  
  
    // 6. Change the next of last node  
    last->next = new_node;  
    return;  
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(ListNode1 *node)  
{  
    while (node != NULL)  
    {  
        cout<<" "<<node->data;  
        node = node->next;  
    }  
}  

ListNode1* AddWTwoNumber(ListNode1 *l1, ListNode1 *l2 ){
    int carry = 0;
    ListNode1 *result = new ListNode1(0);
    ListNode1 *curr = result;
    while(l1 || l2 || carry){
        int d1 = l1 ? l1->data: 0;
        int d2 = l2 ? l2->data: 0;
        int sum = d1 + d2 + carry;
        curr->next = new ListNode1(sum%10);
        curr = curr->next;
        carry = sum/10;
        l1 = l1 ? l1->next:nullptr;
        l2 = l2 ? l2->next:nullptr;
    }
    return(result->next);
    

}
int main(){
   
    // Start with the empty list  
    ListNode1* L1 = NULL; 
    ListNode1* L2 = NULL;  

    push(&L1,2);
    push(&L1,4);
    push(&L1,3);

    push(&L2,5);
    push(&L2,6);
    push(&L2,4);

    cout << "Created Linked list is: \n";  
    cout << "L1 =";  
    printList(L1); 
    cout << "\nL2 ="; 
    printList(L2);
      

    ListNode1 *ResultNode = new ListNode1();
    ResultNode = AddWTwoNumber(L1, L2);
    cout << "\n";
    printList(ResultNode);


      
    // Insert 6. So linked list  
    // becomes 6->NULL  
    // append(&head, 6);  
      
    // // Insert 7 at the beginning.  
    // // So linked list becomes  
    // // 7->6->NULL  
    // push(&head, 7);  
      
    // // Insert 1 at the beginning.  
    // // So linked list becomes  
    // // 1->7->6->NULL  
    // push(&head, 1);  
      
    // // Insert 4 at the end. So  
    // // linked list becomes  
    // // 1->7->6->4->NULL  
    // append(&head, 4);  
      
    // // Insert 8, after 7. So linked  
    // // list becomes 1->7->8->6->4->NULL  
    // insertAfter(head->next, 8);  
      
    
    return 0;  

}