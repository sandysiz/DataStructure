package com.java.stack;

import com.java.arrays.MyLinkedList.Node;

public class MyStack {
	
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
    
    public int peek(MyStack stack) {
		return stack.head.data;
    }
    
    public MyStack push(MyStack stack, int value){
    	// Create a new node with given data 
        Node new_node = new Node(value); 
        new_node.next = null; 
        
        if (stack.head == null) { 
        	stack.head = new_node; 
        } else {
        	// temporarily hold head node
        	Node last = stack.head; 
        	
        	// new node became head
        	stack.head = new_node;
        	
        	// temp previous node became next node
        	stack.head.next = last; 
        }
		return stack;
    }
    
    public int pop(MyStack stack){
    	Node currNode = stack.head; 
    	int popData = currNode.data;
    	stack.head = currNode.next;
    	return popData;
    }
	
    // Method to print the stack. 
    public static void printStack(MyStack stack) 
    { 
        Node currNode = stack.head; 
   
        System.out.print("Stack: "); 
   
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
		MyStack stack = new MyStack();
		stack = stack.push(stack, 1);
		stack = stack.push(stack, 10);
		stack = stack.push(stack, 21);
		stack = stack.push(stack, 31);
		printStack(stack);
		
		System.out.println("Peek : "+stack.peek(stack));
		
		System.out.println("Pop : "+stack.pop(stack));
		printStack(stack);
	}

}
