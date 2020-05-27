package com.java.arrays;

import java.util.HashMap;
import java.util.Map;

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

public class FirstRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = {2,5,1,2,3,5,1,2,4};
		int [] arr = {2,1,1,2,3,5,1,2,4};
//		int [] arr = {2,3,4,5};
		System.out.println("first returning number : "+firstRecurringCharacter2(arr));
	}
	
	public static int firstRecurringCharacter(int[] arr) {
		int theNum=0;
		Map<Integer,Integer> mapInt = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!mapInt.containsKey(arr[i])) {
				mapInt.put(arr[i], 1);
			} else {
				//mapInt.put(arr[i], mapInt.get(arr[i])+1);
				if (mapInt.get(arr[i]) == 1) {
					theNum =arr[i];
					break;
				}
			}
		}
		return theNum;
	} // not much robust
	
	public static int firstRecurringCharacter2(int[] arr) {
		int theNum=0;
		Map<Integer,Integer> mapInt = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!mapInt.containsKey(arr[i])) {
				mapInt.put(arr[i], 1);
			} else {
				theNum =arr[i];
				break;
			}
		}
		System.out.println(mapInt);
		return theNum;
	}

}
