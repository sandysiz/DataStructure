package com.java.peformance;

import java.util.Arrays;

public class SpaceComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boooo(6);
		System.out.println(Arrays.toString(arrayOfHiNTimes(6)));
	}

	//#5 Space complexity O(1)
	public static void boooo(int n) {
	  for (int i = 0; i < n; i++) {
	      System.out.println("booooo");
	  }
	}

	//#6 Space complexity O(n)
	public static String[]  arrayOfHiNTimes(int n) {
	  String[] hiArray = new String[n];;
	  for (int i = 0; i < n; i++) {
	      hiArray[i] = "hi";
	  }
	  return hiArray;
	}
}


