package com.java.algorithms;

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorialRecursive(5));
		System.out.println(findFactorialIterative(5));
	}
	
	public static int findFactorialRecursive(int number) {
		if (number <= 2) {
			return number;
		}
		return number * findFactorialRecursive(number - 1);
	}

	public static int findFactorialIterative(int number) {
		int answer = 1;
		// code here
		while (number > 0) {
			answer = answer * number--;
		}
		return answer;
	}


}
