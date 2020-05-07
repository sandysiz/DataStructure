package com.java.peformance;

public class FindingBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] box = {"0","1","2"};
		findBox(box); // O(1) : constant time
	}
	
	public static void findBox(String[] box){
	    System.out.println(box[0]);
	  }

}
