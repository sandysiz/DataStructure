package com.java.arrays;

public class MyLinkedList {
	
	Node head; // head of list 
	  
    /* Linked list Node*/
    static class Node { 
        int data; 
        Node next; 
  
        // Constructor to create a new node 
        // Next is by default initialized 
        // as null 
        Node(int d) { data = d; } 
    } 
    
    // Method to insert a new node 
    public static MyLinkedList append(MyLinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
    
    // Method to prepend a new node
    private static MyLinkedList prepend(MyLinkedList list, int data) {
    	
    	// Create a new node with given data and the next will be the first element of the existing list
        Node new_node = new Node(data); 
        new_node.next = list.head; 
        
        //new node added to the head
        list.head = new_node; 
        
		return list;
		
	}
    
    // insert in a specific index
	private static MyLinkedList insert(MyLinkedList list, int position, int data) {
		// TODO Auto-generated method stub
		// Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
        
        // Get the previous node
        Node leader = traverseToIndex(list, position-1);
        
        // Assign temp pointer of next node  
        Node holdingPointer = leader.next;
        
        // Assign new node after leader node
        leader.next = new_node;
        
        // Assign temp pointer to newly added node
        new_node.next = holdingPointer;
		return list;
	}
	
	private static MyLinkedList remove(MyLinkedList list, int index) {
		// TODO Auto-generated method stub
		
		// Get the previous node
        Node leader = traverseToIndex(list, index-1);
        
        // Get the deleted node
        Node unwantedNode = leader.next;
        
        leader.next = unwantedNode.next;
        
		return list;
	}
    
    private static Node traverseToIndex(MyLinkedList list, int index) {
		// TODO Auto-generated method stub
    	int counter = 0;
    	Node currentNode = list.head; 
    	while (counter != index) {
    		currentNode = currentNode.next;
    		counter++;
    	}
		return currentNode;
	}
    
    //reverse a linked list
    private static MyLinkedList reverse(MyLinkedList list) {
		// TODO Auto-generated method stub5
    	
    	Node firstNode = list.head; 
    	Node secondNode = firstNode.next; 
    	while (secondNode != null) {
    		Node temp = secondNode.next;
    		secondNode.next = firstNode;
    		firstNode = secondNode;
    		secondNode = temp;
    	}
    	list.head.next = null;
    	list.head = firstNode;
    	
		return list;
	}

	// Method to print the LinkedList. 
    public static void printList(MyLinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
        System.out.println();
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList mylinkedList = new MyLinkedList();
		mylinkedList = append(mylinkedList, 1); 
		mylinkedList = append(mylinkedList, 2); 
		mylinkedList = append(mylinkedList, 3); 
		
		// Print the LinkedList 
        printList(mylinkedList); 
        
        mylinkedList = prepend(mylinkedList, 4);
        
        // Print the LinkedList 
        printList(mylinkedList); 
        
        mylinkedList = insert(mylinkedList, 2, 8);
        
        // Print the LinkedList 
        printList(mylinkedList); 
        
        // remove a specific list
        mylinkedList = remove(mylinkedList, 1);
        
        // Print the LinkedList 
        printList(mylinkedList); 
        
        // reverse a list
        mylinkedList = reverse(mylinkedList);
        
        // Print the LinkedList 
        printList(mylinkedList); 
        
        
	}

	

	



	

	

}

