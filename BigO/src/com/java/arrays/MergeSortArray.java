package com.java.arrays;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = {0,3,4,31};
		int[] second = {3,4,6,30};

		System.out.println(Arrays.toString(mergeSortedArrays(first, second)));
	}

		private static int[] mergeSortedArrays(int[] first, int[] second) {
			
			int[] mergedArr = new int[first.length+second.length];
			// TODO Auto-generated method stub
			
			int i = 0, j = 0, k = 0; 
		      
	        // Traverse both array 
	        while (i<first.length && j <second.length) 
	        { 
	            // Check if current element of first 
	            // array is smaller than current element 
	            // of second array. If yes, store first 
	            // array element and increment first array 
	            // index. Otherwise do same with second array 
	            if (first[i] < second[j]) 
	            	mergedArr[k++] = first[i++]; 
	            else
	            	mergedArr[k++] = second[j++]; 
	        } 
	      
	        // Store remaining elements of first array 
	        while (i < first.length) 
	        	mergedArr[k++] = first[i++]; 
	      
	        // Store remaining elements of second array 
	        while (j < second.length) 
	        	mergedArr[k++] = second[j++]; 
	        
			return mergedArr;
		}
	
}
