package com.java.trees;

public class MyBinarySearchTree {

	Node root;
	
	public void insert(int value) {
	    root = addRecursive(root, value);
	}
	
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinarySearchTree tree = new MyBinarySearchTree();
		tree.insert(9);
		tree.insert(4);
		tree.insert(6);
		tree.insert(20);
		tree.insert(170);
		tree.insert(15);
		tree.insert(1);
		
		printTree(tree.root);
		System.out.println();
		System.out.println("Lookup element :"+tree.lookup(4));
		System.out.println("Lookup element :"+tree.lookup(100));
	}
	
	private boolean lookup(int value) {
		// TODO Auto-generated method stub
		boolean isExist = false;
		Node current = root;
		while(current != null) {
			if (value < current.value) {
		        current = current.left;
		    } else if (value > current.value) {
		        current= current.right;
		    } else if(current.value == value) {
		    	return true;
		    }
		}
		return isExist;
	}

	public static void printTree(Node node) {
	    // base case
	    if (node == null) {
	      return;
	    }

	   
	    System.out.printf("%s ", node.value);
	    

	    printTree(node.left);
	    printTree(node.right);

	  }

}

class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
