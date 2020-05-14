package com.java.peformance;

import java.util.HashMap;
import java.util.Map;

//Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
//For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.
public class ContainsCommonItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"a", "b", "c", "x"};
		String[] array2 = {"z", "y", "d"};
		System.out.println(containsCommonItem1(array1, array2));
		System.out.println(containsCommonItem2(array1, array2));
	}

	// time complexity is O(n^2)
	private static boolean containsCommonItem1(String[] array1, String[] array2) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < array1.length; i++) {
//			for (int j = 0; j < array2.length; j++) {
//				if (array1[i].contains(array2[j])) {
//					return true;
//				}
//			}
//		}
//		return false;
		
		//More readable code
		for (String arr1 : array1) {
			for (String arr2 : array2) {
				if (arr1.contains(arr2)) {
					return true;
				}
			}
		}
		return false;
	}

	//time complexity is O(n)
	private static boolean containsCommonItem2(String[] array1, String[] array2) {
		// TODO Auto-generated method stub
		Map<String,Boolean> map = new HashMap<>();
		
//		for (int i = 0; i < array1.length; i++) {
//			if(!map.containsKey(array1[i])) {
//				map.put(array1[i], Boolean.TRUE);
//			}
//		}
		
		//More readable code
		for (String arr1 : array1) {
			if(!map.containsKey(arr1)) {
				map.put(arr1, Boolean.TRUE);
			}
		}
		
		for (String arr2 : array2) {
			if(map.containsKey(arr2)) {
				return true;
			}
		}
		return false;
	}
	
}
