package com.java.algorithms;

public class RecursionFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacciIterative(1));
		System.out.println(fibonacciRecursive(6));
	}
	
	/*
	 
	 Given a number N return the index value of the Fibonacci sequence, where the sequence is:

	 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 
	 the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3
	 For example fibonacciRecursive(6) should return 8 
	 
	 */
	
	public static int fibonacciIterative(int n){  // O(n)
		int number =0;
		int first = 0;
		int second = 1;
		if (n==1) {
			number = n;
		}
		for (int i = 2; i <= n; i++) {
			number = first + second;
			first = second;
			second = number;
		}
		return number;
	}
		

	public static int fibonacciRecursive(int n) { // O(2^n)
		if (n<2) {
			return n;
		}
		
		return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
	}
		

	
}
