package com.java.queues;

import com.java.stack.MyStack.Node;

public class MyQueue {
	
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
    
    public int peek(MyQueue queue) {
    	return queue.head.data;
    }
    
    public MyQueue enqueue(MyQueue queue, int value){
    	// Create a new node with given data 
        Node new_node = new Node(value); 
        new_node.next = null; 
        
        if (queue.head == null) { 
        	queue.head = new_node; 
        } else {
        	// Else traverse till the last node 
            // and insert the new_node there 
            Node last = queue.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        	
        }
    	return queue;
    }
    
    public int dequeue(MyQueue queue){
    	
    	int dq_data  = queue.head.data;
    	Node first = queue.head;
    	queue.head = first.next;

    	return dq_data;
    }
    
    // Method to print the stack. 
    public static void printQueue(MyQueue queue) 
    { 
        Node currNode = queue.head; 
        System.out.print("Queue: "); 
   
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
		MyQueue queue = new MyQueue();
		queue = queue.enqueue(queue, 10);
		queue = queue.enqueue(queue, 20);
		queue = queue.enqueue(queue, 30);
		queue = queue.enqueue(queue, 40);
		
		printQueue(queue);
		
		System.out.println("Peek : "+queue.peek(queue));
		
		System.out.println("Dequeue : "+queue.dequeue(queue));
		printQueue(queue);
	}

}
