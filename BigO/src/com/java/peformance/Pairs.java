package com.java.peformance;

public class Pairs {

	public static void main(String[] args) {
			// O(n^2) Quadratic time (nested loop is multiply with *)
			int[] num = {1,2,3,4,5};
			for(int i=0; i<num.length;i++) {
				for(int j=0; j<num.length;j++) {
				System.out.println(num[i]+","+num[j]);
			}
		}
	}		

}
